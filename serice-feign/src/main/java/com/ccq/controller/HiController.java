package com.ccq.controller;

import com.ccq.service.ServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by aladdinet on 2018/6/4.
 */
@RestController
public class HiController {

    @Autowired
    ServiceHi serviceHi;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {

        System.out.println("service fegin " + new Date());

        return serviceHi.sayHiFromClientOne(name);
    }
}
