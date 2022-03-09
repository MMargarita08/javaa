package com.company;

public class Square extends Rectangle{
    private double side;

    public Square() {
        this.side = 1.0;
    }
    public Square(double side) {
        super(side,side);
    }
    public Square(double side, String color, boolean filled) {
        super(side,side,color,filled);
    }

    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double width) {
        setSide(side);
    }

    @Override
    public double getLength() {
        setSide(side);
        return 0;
    }

    @Override
    public String toString() {
        return "Square{" + "side = " + side + ", area = " + getArea() + ", perimeter = " + getPerimeter() + '}';
    }
}
