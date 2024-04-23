package com.cloud.fall.mountains.notebook.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;

public class RedisConfig {

    @Bean
    public RedisTemplate<String, String> redisTemplate() {
        return new RedisTemplate<>();
    }
}
