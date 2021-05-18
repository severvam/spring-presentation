package com.example.demo;

public class DemoApplication {

	public static void main(String[] args) {
		var context = new PropertyFileApplicationContext("context.properties");
		var bean = context.getBean(MyService.class);
		bean.doSomething();
	}

}
