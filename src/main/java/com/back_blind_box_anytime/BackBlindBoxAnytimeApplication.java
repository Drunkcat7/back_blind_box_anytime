package com.back_blind_box_anytime;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.back_blind_box_anytime.dao")
public class BackBlindBoxAnytimeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackBlindBoxAnytimeApplication.class, args);
    }

}
