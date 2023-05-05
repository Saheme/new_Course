package edu.javaCourse.lesson_5.classWork.second;

public class CarTest {
    public static void main(String[] args) {
        Car1 car = new Car1();
        car.speed = 80;
        int increase = car.increaseSpeed(50);
        System.out.println(increase);

        System.out.println("------");
        int decrease = car.decreaseSpeed(30);
        System.out.println(decrease);

        System.out.println("----------");
        car.color = "red";
        car.engine = "A5A";
        car.showInfo();
    }
}
