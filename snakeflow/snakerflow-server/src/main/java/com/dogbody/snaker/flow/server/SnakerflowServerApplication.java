package com.dogbody.snaker.flow.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.dogbody.snaker.flow.server.dao")
@SpringBootApplication
public class SnakerflowServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnakerflowServerApplication.class, args);
    }

}
