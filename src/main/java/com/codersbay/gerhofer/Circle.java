package com.codersbay.gerhofer;

public class Circle extends Shapes {


    private double radius;

    public Circle() {
        super();
        if (radius<0){
            throw new IllegalArgumentException();
        }else {
            radius = 1.0;
        }
    }

    public Circle(double radius) {
        super();
        if (radius<0){
            throw new IllegalArgumentException();
        }else {
            this.radius = radius;
        }
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        if (radius<0){
            throw new IllegalArgumentException();
        }else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {

        return String.format("A Circle with radius = %f", radius);
    }
}
