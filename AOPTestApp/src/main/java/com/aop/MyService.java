package com.aop;

import org.springframework.stereotype.Service;

@Service
public class MyService {

	public void performAction() {
        System.out.println("Action performed!");
    }
}
