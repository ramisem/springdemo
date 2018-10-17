package com.springdemo.shapes.beanpostprocessor;

import com.springdemo.shapes.points.TwoDimensionalPoint;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

import java.beans.PropertyDescriptor;

public class CustomInstantiationAwrBnProcessorAdaptor implements InstantiationAwareBeanPostProcessor {

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("1");
        System.out.println(beanClass.getName());
//        System.out.println("CustomInstantiationAwrBnProcessorAdaptor.postProcessBeforeInstantiation");
        return beanClass;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("2");
        if (bean != null) {
//            System.out.println("CustomInstantiationAwrBnProcessorAdaptor.postProcessAfterInstantiation returns true");
            return true;
        }
        System.out.println("CustomInstantiationAwrBnProcessorAdaptor.postProcessAfterInstantiation returns false");
        return false;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        System.out.println("3");
//        System.out.println("CustomInstantiationAwrBnProcessorAdaptor.postProcessPropertyValues");
        return pvs;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("4");
//        System.out.println("CustomInstantiationAwrBnProcessorAdaptor.postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5");
        System.out.println(bean.getClass().getName());
        if (bean instanceof Class)
            return null;
        return bean;
    }
}
