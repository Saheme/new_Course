package edu.javaCourse.lesson_16_String.classWork.first;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("red", "V6");
        Car car2 = car1.abc("black");
        System.out.println(car1.colour);
        System.out.println(car2.colour);
    }
}
