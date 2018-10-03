package com.springdemo.shapes.beanpostprocessor;

import com.springdemo.shapes.points.TwoDimensionalPoint;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Calling from postProcessBeforeInitialization: "+beanName);
        if (bean instanceof TwoDimensionalPoint){
            TwoDimensionalPoint temp=(TwoDimensionalPoint) bean;
            System.out.println(temp.getX());
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Calling from postProcessAfterInitialization: "+beanName);
        return bean;
    }
}
