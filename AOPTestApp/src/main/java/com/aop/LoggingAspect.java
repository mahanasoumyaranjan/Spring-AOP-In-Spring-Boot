package com.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("exceution of aspect before method exceution")
	public void logBeforeMethod() {
		System.out.println("Method exceution started");
	}
}
