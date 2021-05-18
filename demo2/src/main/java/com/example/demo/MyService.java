package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class MyService {

//	@Transactional
	@Annotation1
	public void method1() {
		System.out.println("MyService.method1");
		method2();
	}

//	@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Annotation1
	public void method2() {
		System.out.println("MyService.method2");
	}

}
