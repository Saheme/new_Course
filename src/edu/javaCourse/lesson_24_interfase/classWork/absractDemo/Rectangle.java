package edu.javaCourse.lesson_24_interfase.classWork.absractDemo;

public class Rectangle extends Figure {            //прямоугольник
    int numberOfSides = 4;
    int side1 =8;
    int side2 =8;
    @Override
    public void perimeter() {
        System.out.println("Perimeter rectangle : " + ((side1+side2)*2));
    }

    @Override
    void area() {
        System.out.println("Area rectangle : " + (side1*side2));
    }
}


