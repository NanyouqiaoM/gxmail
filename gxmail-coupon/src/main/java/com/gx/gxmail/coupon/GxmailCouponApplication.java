package com.gx.gxmail.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
@EnableDiscoveryClient
public class GxmailCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(GxmailCouponApplication.class, args);


    }

}
