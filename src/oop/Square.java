package oop;

import java.sql.SQLOutput;

public class Square extends Shape {

    private int width;

    public Square(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    double getSquare() {
        return width * width;
    }

    @Override
    double getPerimeter() {
        return width * 4;
    }

    @Override
    void print() {
        System.out.println("Square " + getSquare());
        System.out.println("Perimeter " + getPerimeter());
    }
}
