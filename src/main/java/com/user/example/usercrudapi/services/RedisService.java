/*
package com.user.example.usercrudapi.services;

import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.scheduling.annotation.Async;

public interface RedisService {

    boolean hasKey(String key);

    String get(String key);

    @Async
    void set(String key, String value);

    @Async
    void setKeyValueAsObject(String key, Object value);

    @Async
    void setWithExpiryInSeconds(String key, String value, long ttl);

    @Async
    void setKeyValueAsObjectWithExpiryInSeconds(String key, Object value, long ttl);

    <T> T getValueAsObject(String key, TypeReference valueTypeRef);

    void deleteKey(String key);
}


 */