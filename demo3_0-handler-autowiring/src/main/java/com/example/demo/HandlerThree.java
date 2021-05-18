package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class HandlerThree implements MyHandler {

	@Override
	public void handle() {
		System.out.println("In HandlerThree");
	}

	@Override
	public String getCode() {
		return "3";
	}

}
