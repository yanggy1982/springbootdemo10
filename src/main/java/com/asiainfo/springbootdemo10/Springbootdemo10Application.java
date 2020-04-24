package com.asiainfo.springbootdemo10;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.asiainfo.springbootdemo10.dao")
public class Springbootdemo10Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootdemo10Application.class, args);
    }

}
