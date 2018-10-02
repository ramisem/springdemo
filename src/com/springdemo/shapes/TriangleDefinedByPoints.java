package com.springdemo.shapes;

import com.springdemo.shapes.points.TwoDimensionalPoint;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TriangleDefinedByPoints implements ApplicationContextAware{

    private TwoDimensionalPoint pointA;
    private TwoDimensionalPoint pointB;
    private TwoDimensionalPoint pointC;

    public TwoDimensionalPoint getPointA() {
        return pointA;
    }

    public void setPointA(final TwoDimensionalPoint pointA) {
        this.pointA = pointA;
        System.out.println("Calling setPointA");
    }

    public TwoDimensionalPoint getPointB() {
        return pointB;
    }

    public void setPointB(final TwoDimensionalPoint pointB) {
        this.pointB = pointB;
        System.out.println("Calling setPointB");
    }

    public TwoDimensionalPoint getPointC() {
        return pointC;
    }

    public void setPointC(final TwoDimensionalPoint pointC) {
        this.pointC = pointC;
        System.out.println("Calling setPointC");
    }

    public void draw( ){
        System.out.println("Point A Coordinates: ("+this.getPointA().getX()+","+this.getPointA().getY()+" )");
        System.out.println("Point B Coordinates: ("+this.getPointB().getX()+","+this.getPointB().getY()+" )");
        System.out.println("Point C Coordinates: ("+this.getPointC().getX()+","+this.getPointC().getY()+" )");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("DemoOfAwareInterfaces: "+applicationContext.getStartupDate());
    }
}
