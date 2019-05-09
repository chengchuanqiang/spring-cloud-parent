package com.ccq.controller;

import com.ccq.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author chengchuanqiang
 * @date 2018/6/4
 */
@RestController
public class HiController {

    private final HiService hiService;

    @Autowired
    public HiController(HiService hiService) {
        this.hiService = hiService;
    }

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {

        System.out.println("service feign " + new Date());

        return hiService.sayHiFromClientOne(name);
    }
}
