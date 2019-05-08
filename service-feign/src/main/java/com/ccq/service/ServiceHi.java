package com.ccq.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chengchuanqiang
 * @date 2018/6/4
 */
@FeignClient(value = "service-hi")
public interface ServiceHi {

    /**
     * 调用service-hi
     *
     * @param name name
     * @return string
     */
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
