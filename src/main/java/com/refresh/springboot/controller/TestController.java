package com.refresh.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/test")
    public Map<String,String> dummy(){
        Map<String,String> a = new HashMap();
        a.put("a","b");
        return a;
    }
}
