package edu.javaCourse.lesson_24_interfase.classWork.absractDemo;

public class Circle extends Figure { //окружность

    int numberOfSides = 0;
    int radius =5;

    @Override
    public void perimeter() {
        System.out.println("Perimeter circle : " + (2*PI*radius)); //  2Pr -формула
    }

    @Override
    void area() {
        System.out.println("Area circle : " + (Math.pow((PI*radius),2)));
    }
}
