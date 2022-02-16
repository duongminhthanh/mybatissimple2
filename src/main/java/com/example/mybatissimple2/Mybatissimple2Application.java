package com.example.mybatissimple2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.mybatissimple2.mapper"})
public class Mybatissimple2Application {

	public static void main(String[] args) {
		SpringApplication.run(Mybatissimple2Application.class, args);
	}

}
