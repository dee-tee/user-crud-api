package com.user.example.usercrudapi.services;

import com.user.example.usercrudapi.entities.User;
import com.user.example.usercrudapi.exceptions.MyException;
import com.user.example.usercrudapi.exceptions.ErrorCode;
import com.user.example.usercrudapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceimpl implements UserService{
    private static final String TOPIC="Kafka_Example";
    @Autowired
    private UserRepository userRepository;
    @Autowired
    KafkaTemplate<String, User> kafkaTemplate;
    @Override
    public User createUser(User user) throws MyException {
        if(user.getName().isEmpty()||user.getName().length()==0)
        {
            throw new MyException(ErrorCode.EMPTY_NAME,"Name cannot be empty");
        }
        if(user.getPhone()<1000000000)
        {
            throw new MyException(ErrorCode.INVALID_PHONE_NUMBER,"Phone number less than 10 digits");
        }
        kafkaTemplate.send(TOPIC,user);

        return userRepository.save(user);
    }

    @Override
    @CachePut(key="#id",value="User")
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    @Cacheable(value="User")
    public List<User> getAllUsers() throws MyException {
        List<User> userList=userRepository.findAll();
        if(userList.isEmpty())
            throw new MyException(ErrorCode.EMPTY_RECORDS,"Empty List Of Users");
        System.out.println("Fetched from Database");
        return userList;

    }

    @Override
    @Cacheable(key="#userId",value="User")
    public User getUserById(long userId) throws MyException {
        Optional<User> userObj=userRepository.findById(userId);
        if(userObj.isPresent())
        {
            System.out.println("Fetched from Database");
            return userObj.get();
        }
        else
        {
            throw new MyException(ErrorCode.DOES_NOT_EXIST,"No such user exist");
        }

    }

    @Override
    @CacheEvict(key="#userId",value="User")
    public User deleteUser(long userId) throws MyException {
        Optional<User> userObj=userRepository.findById(userId);
        if(userObj.isPresent())
        {
            this.userRepository.delete(userObj.get());
            kafkaTemplate.send(TOPIC,userObj.get());
            return userObj.get();
        }
        else
        {
            throw new MyException(ErrorCode.DOES_NOT_EXIST,"No such user exist");
        }
    }
}
