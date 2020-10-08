package com.gx.gxmail.product;

import com.gx.gxmail.product.entity.BrandEntity;
import com.gx.gxmail.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest
class GxmailProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("西雨");
        System.out.println(brandService.save(brandEntity) + "====");
    }

}
