package com.waylau.lite.spring.boot.starter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.waylau.lite.spring.boot.starter.mapper") // MyBatis扫描Mapper的位置
public class LiteSpringBootStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiteSpringBootStarterApplication.class, args);
	}

}

