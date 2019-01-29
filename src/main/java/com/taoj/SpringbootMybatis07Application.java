package com.taoj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.taoj.dao")
public class SpringbootMybatis07Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatis07Application.class, args);
    }

}

