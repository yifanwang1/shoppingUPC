package com.upc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.upc.mapper")
public class ShoppingApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShoppingApplication.class, args);
	}
}
