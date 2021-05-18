package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class MyInterfaceImpl implements MyInterface {

	@InjectOperatingSystem
	private String operatingSystem;

	@Override
	public void doSomething() {
		System.out.printf("Hi, I'm running on %s%n", operatingSystem);
	}

}
