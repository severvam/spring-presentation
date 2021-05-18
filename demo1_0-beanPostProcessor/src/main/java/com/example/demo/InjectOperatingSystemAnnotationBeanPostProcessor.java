package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

import static java.lang.System.getProperty;
import static org.springframework.util.ReflectionUtils.setField;

@Component
public class InjectOperatingSystemAnnotationBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		var declaredFields = bean.getClass().getDeclaredFields();
		for (Field declaredField : declaredFields) {
			var annotation = declaredField.getAnnotation(InjectOperatingSystem.class);
			if (annotation != null) {
				declaredField.setAccessible(true);
				setField(declaredField, bean, getProperty("os.name"));
			}
		}
		return bean;
	}

}
