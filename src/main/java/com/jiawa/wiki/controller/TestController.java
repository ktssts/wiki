package com.jiawa.wiki.controller;

import com.jiawa.wiki.TestService;
import com.jiawa.wiki.domain.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class TestController {

    @Value("${test.hello:TEST}")
    private String testHello;

    @Resource
    private TestService testService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello world!" + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World! Post" + name;
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
