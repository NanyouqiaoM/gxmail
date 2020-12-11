package com.gx.gxmail.warehouse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.gx.gxmail.warehouse.dao")
public class GxmailWarehouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(GxmailWarehouseApplication.class, args);
    }

}
