package com.ccq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chengchuanqiang
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerApplication {

    /**
     * http://localhost:8000/master/config-client-dev.properties
     * http://localhost:8000/config-client-dev.yml
     * http://localhost:8000/config-client/dev
     * http://localhost:8000/config-client/dev/master
     *
     * http://localhost:8000/config-client-dev.properties
     * http://localhost:8000/master/test-dev.properties
     * http://localhost:8000/master/eureka-server-dev.properties
     *
     * @param args
     */

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
