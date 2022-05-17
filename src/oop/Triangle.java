package oop;

public class Triangle extends Shape {
    private int height,width;

    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    double getSquare() {
        return 0.5 * height * width;
    }

    @Override
    double getPerimeter() {
        return 3 * width;
    }

    @Override
    void print() {
        System.out.println("Square " + getSquare());
        System.out.println("Perimeter " + getPerimeter());
    }
}
