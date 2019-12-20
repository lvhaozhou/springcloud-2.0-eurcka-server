package com.lhz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: lhz
 * @Date: 2019/12/7 0007 14:12
 * @Description: 注册中心启动类q
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class AppEureka {
    //@EnableEurekaServer 表示开启注册中心
    public static void main(String[] args) {
        SpringApplication.run(AppEureka.class, args);
    }
}

