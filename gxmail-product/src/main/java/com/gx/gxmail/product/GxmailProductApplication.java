package com.gx.gxmail.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.gx.gxmail.product.dao")
@SpringBootApplication
public class GxmailProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GxmailProductApplication.class, args);
    }

}
