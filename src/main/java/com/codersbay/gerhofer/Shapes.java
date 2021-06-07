package com.codersbay.gerhofer;

public abstract class Shapes {

    private String color;
    private boolean filled;

    public Shapes(String color, boolean filled){

        this.color = color;
        this.filled = filled;
    }

    public Shapes() {

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
