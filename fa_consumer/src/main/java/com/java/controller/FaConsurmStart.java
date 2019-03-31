package com.java.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * date:2019-02-24
 * 13:52
 * description:FaConsurmStart
 * author:潘全科
 */
@SpringBootApplication(scanBasePackages = {"com.java.controller","com.java.service.impl"})
public class FaConsurmStart {
    public static void main(String[] args) {
        SpringApplication.run(FaConsurmStart.class);
    }
}
