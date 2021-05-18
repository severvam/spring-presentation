package com.example.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MyInterfaceImpl implements MyInterface {

	@InjectOperatingSystem
	private String operatingSystem;

	@PostConstruct
	public void init() {
		System.out.printf("PostConstruct %s%n", operatingSystem);
	}

	public MyInterfaceImpl() {
		System.out.printf("Constructor %s%n", operatingSystem);
	}

	@Override
	public void doSomething() {
		System.out.printf("Hi, I'm running on %s%n", operatingSystem);
	}

}
