package com.example.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspect1 {

	@Pointcut("@annotation(com.example.demo.Annotation1)")
	public void annotated() {}

	@Before("annotated()")
	public void printABit() {
		System.out.println("Aspect1");
	}

}
