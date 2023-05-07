package edu.javaCourse.lesson_11.homeWork;

public class Car {
    String colour;
    String engine;
    int numberOfDoor;

    public Car(String colour) {
        this.colour = colour;
    }

    public Car(String colour, String engine, int numberOfDoor) {
        this.colour = colour;
        this.engine = engine;
        this.numberOfDoor = numberOfDoor;
    }

    public  void changeNumberOfDoor(int a){
        numberOfDoor = a;
    }
    public static  void changeColour(Car car1 , Car car2){
        Car car3 = new Car("white");
        car3.colour = car1.colour;
        car1.colour = car2.colour;
        car2.colour = car3.colour;





    }

}
