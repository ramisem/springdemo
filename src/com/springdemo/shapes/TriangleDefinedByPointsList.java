package com.springdemo.shapes;

import com.springdemo.shapes.points.TwoDimensionalPoint;

import java.util.List;

public class TriangleDefinedByPointsList {
    private List<TwoDimensionalPoint> points;

    public List<TwoDimensionalPoint> getPoints() {
        return points;
    }

    public void setPoints(final List<TwoDimensionalPoint> points) {
        this.points = points;
    }

    public void draw( ){
        int i=1;
        for (TwoDimensionalPoint point:this.points){
            System.out.println("Point No."+(i++ )+": ("+point.getX()+","+point.getY()+" )");
        }
    }
}
