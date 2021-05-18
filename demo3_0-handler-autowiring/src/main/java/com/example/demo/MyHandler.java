package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public interface MyHandler {

	void handle();

	String getCode();

	@Autowired
	default void selfRegister(HandlerService handlerService) {
		handlerService.register(getCode(), this);
	}

}
