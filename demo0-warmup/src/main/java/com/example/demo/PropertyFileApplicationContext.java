package com.example.demo;

import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class PropertyFileApplicationContext extends GenericApplicationContext {

    public PropertyFileApplicationContext(String filename) {
        var propertiesBeanDefinitionReader = new PropertiesBeanDefinitionReader(this);
        propertiesBeanDefinitionReader.loadBeanDefinitions(filename);
        refresh();
    }

}
