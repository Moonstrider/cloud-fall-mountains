package com.cloudfall.mountains.notebook.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {

    private final RedisTemplate<String, String> redisTemplate;

    public CacheController(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @GetMapping("/get")
    public String getCache() {
        return redisTemplate.opsForValue().get("b");
    }

    @GetMapping("/set")
    public String setCache() {
        redisTemplate.opsForValue().set("b", "bbb");
        return "ok";
    }
}
