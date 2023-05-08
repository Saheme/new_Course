package edu.javaCourse.lesson_12.classWork.second;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car(8, 1);
        Car car2 = new Car(10, 2);

        if (car1.engine > car2.engine) {
            if (car1.numberOfDoors > car2.numberOfDoors) {
                System.out.println("First car is the best.");
            } else {
                System.out.println("First car has more power engine bun it has less doors.");
            }
        } else {
            System.out.println("First car has lees engine");
        }

    }

}

