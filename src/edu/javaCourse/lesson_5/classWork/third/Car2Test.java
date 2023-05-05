package edu.javaCourse.lesson_5.classWork.third;

public class Car2Test {
    public static void main(String[] args) {
        Car2 car = new Car2("white", "V6");
        System.out.println(car.color + " " + car.engine);

        Car2 car1 = new Car2();
        Car2 car2 = new Car2("green","A4");
    }
}
