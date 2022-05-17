package oop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.makeSound();
//
//        ExampleOfInheritanceInterface exampleOfInheritanceInterface = new ExampleOfInheritanceInterface();
//        exampleOfInheritanceInterface.getNumber(10);
        Triangle firstTriangle = new Triangle(10, 10);
        Square firstSquare = new Square(5 );
        Rectangle firstRect = new Rectangle(3, 5);
        ArrayList<Shape> shapes = new ArrayList();
        shapes.add(firstSquare);
        shapes.add(firstRect);
        shapes.add(firstTriangle);
        for(int i =0;i<shapes.size();i++){
            shapes.get(i).print();
        }
//
//        firstRect.print();
//        firstSquare.print();
//        firstTriangle.print();
    }
}
