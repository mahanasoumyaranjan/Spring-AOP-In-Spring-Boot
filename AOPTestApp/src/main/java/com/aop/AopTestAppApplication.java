package com.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopTestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopTestAppApplication.class, args);
	}

}
