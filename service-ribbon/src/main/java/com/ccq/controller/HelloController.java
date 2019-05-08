package com.ccq.controller;

import com.ccq.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 *
 * @author chengchuanqiang
 * @date 2018/6/1
 */
@RestController
public class HelloController {

    private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        System.out.println("service ribbon " + new Date());
        return helloService.hiService(name);
    }
}
