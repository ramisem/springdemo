package com.springdemo.aop.bean;

import com.springdemo.aop.annotation.MethodPointCutAnnotation;
import com.springdemo.aop.aopinterface.MarksCalc;

public class Student implements MarksCalc {
    private Integer age;
    private String name;

    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        System.out.println("Age : " + age );
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        System.out.println("Name : " + name );
        return name;
    }
    public void printThrowException(){
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }

    @Override
    public void calcMarks() {
        System.out.println("Marks is getting calclated..");
    }

    @MethodPointCutAnnotation
    public void annotatedMethod(){
        System.out.println("annotatedMethod is getting called");
    }
}
