package com.ccq.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/********************************
 *** hello
 ***@Author chengchuanqiang
 ***@Date 2019/5/6 16:14
 ***@Version 1.0.0
 ********************************/
@RestController
public class HiController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return "hi " + name + ",i am from port:" + port;
    }

}
