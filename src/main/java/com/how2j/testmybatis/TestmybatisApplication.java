package com.how2j.testmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.how2j.testmybatis.repository")
public class TestmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestmybatisApplication.class, args);
    }

}
