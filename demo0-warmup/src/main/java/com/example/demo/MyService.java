package com.example.demo;

public class MyService {

	private String operatingSystem;

	public void doSomething() {
		System.out.printf("Hi, I'm running on %s%n", operatingSystem);
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

}
