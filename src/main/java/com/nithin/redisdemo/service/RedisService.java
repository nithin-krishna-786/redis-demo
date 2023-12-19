package com.nithin.redisdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void saveToRedis(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }

    public String readFromRedis(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }
}
