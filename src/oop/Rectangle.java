package oop;

public class Rectangle extends Shape {
    private int width, height;

    public Rectangle(int height, int width) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getSquare() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    void print() {
        System.out.println("Square " + getSquare());
        System.out.println("Perimeter " + getPerimeter());
    }
}
