package com.springdemo.shapes;

import com.springdemo.shapes.points.TwoDimensionalPoint;

public class TriangleWithConstructorWiring {
    private TwoDimensionalPoint pointA;
    private TwoDimensionalPoint pointB;
    private TwoDimensionalPoint pointC;

    public TriangleWithConstructorWiring(final TwoDimensionalPoint pointA, final TwoDimensionalPoint pointB, final TwoDimensionalPoint pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public void draw( ){
        System.out.println("Point A Coordinates: ("+this.pointA.getX()+","+this.pointA.getY()+" )");
        System.out.println("Point B Coordinates: ("+this.pointB.getX()+","+this.pointB.getY()+" )");
        System.out.println("Point C Coordinates: ("+this.pointC.getX()+","+this.pointC.getY()+" )");
    }
}
