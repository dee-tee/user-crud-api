/*
package com.user.example.usercrudapi.services;


import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisServiceimpl implements RedisService{



    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @Override
    public boolean hasKey(String key) {
        return false;
    }

    @Override
    public String get(String key) {
        return null;
    }

    @Override
    public void set(String key, String value) {

    }

    @Override
    public void setKeyValueAsObject(String key, Object value) {

    }

    @Override
    public void setWithExpiryInSeconds(String key, String value, long ttl) {

    }

    @Override
    public void setKeyValueAsObjectWithExpiryInSeconds(String key, Object value, long ttl) {

    }

    @Override
    public <T> T getValueAsObject(String key, TypeReference valueTypeRef) {
        return null;
    }

    @Override
    public void deleteKey(String key) {

    }
}
*/