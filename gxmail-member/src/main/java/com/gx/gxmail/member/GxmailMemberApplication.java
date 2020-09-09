package com.gx.gxmail.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GxmailMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GxmailMemberApplication.class, args);
    }

}
