package com.ccq.service.impl;

import com.ccq.service.HiService;
import org.springframework.stereotype.Component;

/********************************
 ***
 ***@Author chengchuanqiang
 ***@Date 2019/5/8 18:29
 ***@Version 1.0.0
 ********************************/
@Component
public class HystrixHiServiceImpl implements HiService {

    /**
     * 熔断方法
     * @param name name
     * @return
     */
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry, " + name;
    }
}
