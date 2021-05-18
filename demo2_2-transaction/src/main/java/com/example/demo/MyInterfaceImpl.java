package com.example.demo;

import org.springframework.stereotype.Component;

@Component
@MyTransaction
public class MyInterfaceImpl implements MyInterface {

    @Override
    public void doSomething() {
        System.out.println("Hi, I am method from transactional class");
    }

}
