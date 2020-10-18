package com.gx.gxmail.product;

import com.gx.gxmail.product.entity.BrandEntity;
import com.gx.gxmail.product.service.BrandService;
import com.gx.gxmail.product.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
@Slf4j
@SpringBootTest
class GxmailProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Autowired
    CategoryService categoryService;
    @Test
    void findCatelogPathTest() {
        Long[] paths=categoryService.findCatelogPath(225L);
        log.info("路径{}", categoryService.findCatelogPath(225L));
    }
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("西雨");
        System.out.println(brandService.save(brandEntity) + "====");
    }

}
