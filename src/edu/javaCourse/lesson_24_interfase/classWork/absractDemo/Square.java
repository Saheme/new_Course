package edu.javaCourse.lesson_24_interfase.classWork.absractDemo;

public class Square extends Figure { ////квадрат
    int numberOfSides = 4;
    int side =10;


    @Override
    public void perimeter() {
        System.out.println("Perimeter square : " + (side*4));
    }

    @Override
    void area() {
        System.out.println("Area square : " + (Math.pow(side,2)));
    }
}
