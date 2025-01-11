package com.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(* com.aop.*.*(..))")
	public void logBeforeMethod() {
		System.out.println("Method exceution started");
	}
}
