package edu.javaCourse.lesson_4.classwork.second;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 =car1;
        System.out.println(car3.engine + " " + car3.color);
        System.out.println("---------------");
        System.out.println(new Car().color);
        System.out.println("-------------");
        Car car4 = new Car();
        car4.color = "black";
        car4.engine = "V8";
        System.out.println("мотор : " + car4.engine + " цвет : " + car4.color);
    }
}
