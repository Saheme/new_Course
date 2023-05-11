package edu.javaCourse.lesson_16_String.classWork.first;

public class Car {
    String colour;
    String engine;

    public Car(String colour, String engine) {
        this.colour = colour;
        this.engine = engine;
    }

    final static int a = 5;

    public Car abc(String str){
        Car car = new Car(str,"V4");
        return car;
    }


}
