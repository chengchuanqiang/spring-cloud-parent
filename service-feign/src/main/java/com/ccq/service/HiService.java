package com.ccq.service;

import com.ccq.service.impl.HystrixHiServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chengchuanqiang
 * @date 2018/6/4
 */
@FeignClient(value = "service-hi", fallback = HystrixHiServiceImpl.class)
public interface HiService {

    /**
     * 调用service-hi
     *
     * @param name name
     * @return string
     */
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
