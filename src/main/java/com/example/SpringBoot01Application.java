package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.example.dao.mapper")
@SpringBootApplication
public class SpringBoot01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot01Application.class, args);
    }
}
