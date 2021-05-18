package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class MyInterfaceImpl implements MyInterface {

	@Override
	@Annotation1
	public void method1() {
		System.out.println("MyInterfaceImpl.method1");
		method2();
	}

	@Override
	@Annotation1
	public void method2() {
		System.out.println("MyInterfaceImpl.method1");
	}

}
