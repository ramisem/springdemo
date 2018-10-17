package com.springdemo.shapes.points;

public class TwoDimensionalPoint {
    private int x;
    private int y;

    public TwoDimensionalPoint(){
        System.out.println("TwoDimensionalPoint constructor gets called");
    }

    public int getX() {
        return x;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(final int y) {
        this.y = y;
    }
}
