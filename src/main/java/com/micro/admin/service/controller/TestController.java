package com.micro.admin.service.controller;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Cacheable
@CacheConfig(cacheNames = "admin_test")
@RequestMapping(value = "/")
public class TestController {

    @GetMapping("")
    @Cacheable
    public String getName() {
        return "Admin Micro Service";
    }

    @PostMapping("")
    public String postName() {
        return "Admin Micro Service";
    }
}
