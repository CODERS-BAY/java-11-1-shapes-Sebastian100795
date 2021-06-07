package com.codersbay.gerhofer;

public abstract class Shape {

    private String color;
    private boolean filled;

    public Shape(String color, boolean filled){

        this.color = color;
        this.filled = filled;
    }

    public Shape() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract public double getArea();
    abstract public double getPerimeter();

    public String toString() {

        return String.format("A Shape with color of %s", color);
    }
}
