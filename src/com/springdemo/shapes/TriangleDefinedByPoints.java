package com.springdemo.shapes;

import com.springdemo.shapes.points.TwoDimensionalPoint;

public class TriangleDefinedByPoints {

    private TwoDimensionalPoint pointA;
    private TwoDimensionalPoint pointB;
    private TwoDimensionalPoint pointC;

    public TwoDimensionalPoint getPointA() {
        return pointA;
    }

    public void setPointA(final TwoDimensionalPoint pointA) {
        this.pointA = pointA;
    }

    public TwoDimensionalPoint getPointB() {
        return pointB;
    }

    public void setPointB(final TwoDimensionalPoint pointB) {
        this.pointB = pointB;
    }

    public TwoDimensionalPoint getPointC() {
        return pointC;
    }

    public void setPointC(final TwoDimensionalPoint pointC) {
        this.pointC = pointC;
    }

    public void draw( ){
        System.out.println("Point A Coordinates: ("+this.getPointA().getX()+","+this.getPointA().getY()+" )");
        System.out.println("Point B Coordinates: ("+this.getPointB().getX()+","+this.getPointB().getY()+" )");
        System.out.println("Point C Coordinates: ("+this.getPointC().getX()+","+this.getPointC().getY()+" )");
    }

}
