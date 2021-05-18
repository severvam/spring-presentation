package com.example.demo;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyTransactionAnnotationBeanPostProcessor implements BeanPostProcessor {

	Map<String, Class> beanOriginalClassMap = new HashMap<>();

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		var originalClass = bean.getClass();
		if (originalClass.isAnnotationPresent(MyTransaction.class)) {
			beanOriginalClassMap.put(beanName, bean.getClass());
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		var beanOriginalClass = beanOriginalClassMap.get(beanName);
		if (beanOriginalClass != null) {
			return Proxy.newProxyInstance(
				beanOriginalClass.getClassLoader(),
				beanOriginalClass.getInterfaces(),
				(proxy, method, args) -> {
					System.out.println("Transaction opened");
					Object invokationResult = method.invoke(bean, args);
					System.out.println("Transaction closed");
					return invokationResult;
				}
			);
		}
		return bean;
	}
}
