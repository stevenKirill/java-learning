package oop;


public class ExampleOfInheritanceInterface implements InterfaceExample{
    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
    public int getNumber(int number) {
        return number;
    }
}
