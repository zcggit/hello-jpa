package com.example.jpatest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhongcaigui@data-baker.com
 * @Date 2019/4/7 15:05
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/say",method = RequestMethod.GET)
    public String sayHi(){
        return  "Hello My First SpringBoot!";
    }
}
