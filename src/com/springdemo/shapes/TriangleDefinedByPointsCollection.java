package com.springdemo.shapes;

import com.springdemo.shapes.points.TwoDimensionalPoint;

import java.util.*;

public class TriangleDefinedByPointsCollection {
    private List<Object> pointsList;
    private Map<String,Object> pointsMap;
    private Set<Object> pointsSet;
    private Properties info;

    public List<Object> getPointsList() {
        return pointsList;
    }

    public void setPointsList(final List<Object> pointsList) {
        this.pointsList = pointsList;
    }

    public Map<String, Object> getPointsMap() {
        return pointsMap;
    }

    public void setPointsMap(final Map<String, Object> pointsMap) {
        this.pointsMap = pointsMap;
    }

    public Set<Object> getPointsSet() {
        return pointsSet;
    }

    public void setPointsSet(final Set<Object> pointsSet) {
        this.pointsSet = pointsSet;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(final Properties info) {
        this.info = info;
    }

    public void drawFromList(){
        int i=1;
        System.out.println("Triangel "+this.info.getProperty("name")+" is going to be drawn fom list of points");
        for (Object obj:this.pointsList){
            if (obj.getClass().getName().equalsIgnoreCase("com.springdemo.shapes.points.TwoDimensionalPoint")){
                TwoDimensionalPoint point=(TwoDimensionalPoint)obj;
                System.out.println("Point No. "+(i++)+": ("+point.getX()+","+point.getY()+")");
            }
            else if (obj.getClass().getName().equalsIgnoreCase("java.lang.String")){
                System.out.println("Point No. "+(i++)+": "+obj.toString());
            }

        }

    }

    public void drawFromMap(){
        int i=1;
        System.out.println("Triangel "+this.info.getProperty("name")+" is going to be drawn fom map of points");
        Set<String> mapKeySet=this.pointsMap.keySet();
        for (String key:mapKeySet){
            if ("pointByref".equalsIgnoreCase(key) || "pointByBean".equalsIgnoreCase(key)){
                TwoDimensionalPoint point=(TwoDimensionalPoint)this.pointsMap.get(key);
                System.out.println("Point No. "+(i++)+": ("+point.getX()+","+point.getY()+")");
            }
            else if ("pointByString".equalsIgnoreCase(key)){
                System.out.println("Point No. "+(i++)+": "+this.pointsMap.get(key));
            }
        }
    }
}
