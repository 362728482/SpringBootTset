package com.springboot.test.springboottest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;



@SpringBootApplication
@MapperScan("com.springboot.test.springboottest.dao")
public class SpringbootTestApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootTestApplication.class, args);
    }

}
