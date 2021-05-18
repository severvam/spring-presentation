package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class HandlerTwo implements MyHandler {

	@Override
	public void handle() {
		System.out.println("In HandlerTwo");
	}

	@Override
	public String getCode() {
		return "2";
	}

}
