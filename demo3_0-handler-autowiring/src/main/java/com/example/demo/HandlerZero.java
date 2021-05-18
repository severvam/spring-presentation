package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class HandlerZero implements MyHandler {

	@Override
	public void handle() {
		System.out.println("In HandlerZero");
	}

	@Override
	public String getCode() {
		return "0";
	}

}
