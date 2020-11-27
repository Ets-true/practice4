package com.company;

public class Square extends Rectangle {

    public Square() {
        super();
        this.length = 0;
        this.width = 0;
    }

    public Square(double side) {
        super();
        this.width = side;
        this.length = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.width = side;
        this.length = side;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square{" + "width=" + width + ", length=" + length + ", color='" + color + '\'' + ", filled=" + filled + '}';
    }
}
