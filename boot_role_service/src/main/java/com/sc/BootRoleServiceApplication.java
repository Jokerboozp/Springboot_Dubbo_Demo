package com.sc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.sc.mapper")
public class BootRoleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootRoleServiceApplication.class, args);
    }

}
