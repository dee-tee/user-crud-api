/*
package com.user.example.usercrudapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Arrays;

@Configuration
@EnableCaching
public class RedisConfig {
    @Value("${spring.redis.host}")
    private String redisHost;

    @Value("${spring.redis.port}")
    private Integer redisPort;

    @Value("${spring.redis.cluster.node}")
    private String node;

    @Value("${spring.redis.mode}")
    private String redisMode;

    @Bean
    JedisConnectionFactory jedisConnectionFactory() {
        JedisConnectionFactory jedisConFactory = new JedisConnectionFactory();
        if ("SINGLE_NODE".equals(this.redisMode)){
            jedisConFactory.setHostName(this.redisHost);
            jedisConFactory.setPort(this.redisPort);
            jedisConFactory.afterPropertiesSet();
        } else {
            jedisConFactory = new JedisConnectionFactory(new RedisClusterConfiguration(
                    Arrays.asList(node)
            ));
        }
        return jedisConFactory;
    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate() {
        RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
        template.setConnectionFactory(jedisConnectionFactory());
        template.afterPropertiesSet();
        return template;
    }

    @Bean
    public RedisCacheManager.RedisCacheManagerBuilder cacheManager(JedisConnectionFactory jedisConnectionFactory) {
        RedisCacheManager.RedisCacheManagerBuilder cacheManager =RedisCacheManager.builder(jedisConnectionFactory);
//        cacheManager.setDefaultExpiration(300);
        return cacheManager;
    }


}
*/

