package rikkei.academy;

import rikkei.academy.Circle;

public class Cylinder extends Circle {
    private double height=1;


    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder() {
    }


    public double Height() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double getVolume(){
        return height*getRadius()*getRadius()*Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", color='" + color + '\'' +
                "getArea"+getVolume()+'\''+
                '}';
    }
}