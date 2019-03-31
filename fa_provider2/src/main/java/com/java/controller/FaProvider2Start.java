package com.java.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * date:2019-02-24
 * 13:46
 * description:FaProvider1Start
 * author:潘全科
 */
@SpringBootApplication(scanBasePackages = {"com.java.controller","com.java.service.impl"})
@MapperScan(basePackages = "com.java.mapper")
public class FaProvider2Start {
    public static void main(String[] args) {
        SpringApplication.run(FaProvider2Start.class);
    }
}
