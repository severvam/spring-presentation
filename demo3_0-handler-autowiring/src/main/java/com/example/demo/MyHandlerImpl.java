package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class MyHandlerImpl implements MyHandler {

	@Override
	public void handle() {
		System.out.println("In MyHandlerIml");
	}

	@Override
	public String getCode() {
		return "1";
	}

}
