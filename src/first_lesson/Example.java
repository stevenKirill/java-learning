package first_lesson;

import java.util.ArrayList;

public class Example {
    void funcExample(){
        System.out.println("Nothing return");
    }
    int num = 2;
    public static void main(String[] args) {
//        first_lesson.Bird bird = new first_lesson.Bird("first_lesson.Bird",true);
//        bird.toString();

        ArrayList<Box> names = new ArrayList<>();
        Box box = new Box();
        box.set(20);

        Box box2 = new Box();
        box.set(20);
        names.add(box);
//        names.add("Usman");
//        System.out.println(names.get(0));
//        names.remove(0);//names.remove("Ivan");

//        for (String eachElement: names) {
//            System.out.println(eachElement);
//        }
//        for(int i = 0;i<names.size();i++){
//            System.out.println(names.get(i));
//        }
//        names.set(0,"Kirill");
        System.out.println(names);

//        first_lesson.Figure figure = new first_lesson.Figure(10,20);
//        System.out.println(figure);
        //first_lesson.Box box = new first_lesson.Box();
//        first_lesson.Box box = new first_lesson.Box();
//        box.set(10);
//        System.out.println(box.get());
       // System.out.println("Hello World");//console log
//        int a = 10;
//        double b = 20.3;
//        float c = 10.3f;
//        long d = 20;
//        String exampleString = "Hello world";
//        System.out.println(exampleString);
//        char symbol = 'a';
//        boolean isExists = false;
//
//        //a = 10
//        //b = 20
//        int a = 10;
//        int b = 20;
//        int c = a;
//        a = b;
//        b = c;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//
//        if (a >= b) {
//            System.out.println("Some action");
//        } else if (a == b) {
//            System.out.println("equal");
//        } else {
//            System.out.println("Some action");
//        }
//        int number1 = 10;
//        int number2 = 10;
//        System.out.println(number1 == number2);
//
//        if (a > b && a > c || b == c) { //&& и || или
//
//        }
//        System.out.println("Some action");
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }

        int array[] = new int[10];
        for(int i=0;i<array.length;i++){
            array[i] = i+10;
        }
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
        //first_lesson.Example.someFunc()
//        first_lesson.Example ex = new first_lesson.Example();
//        System.out.println(ex.someFunc(10,20));
    }


    static int someFunc(int arg1,int arg2){
        return arg1+arg2;
    }
}

