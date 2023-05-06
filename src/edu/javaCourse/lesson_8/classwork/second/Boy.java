package edu.javaCourse.lesson_8.classwork.second;

import edu.javaCourse.lesson_4.classwork.second.Car;

public class Boy {
    String name = "Ivan";
    final Bike bike = new Bike();

    public static void main(String[] args) {
        Boy boy1 =new Boy();
       // boy1.bike = new Bike(); // менять объект нельзя
        boy1.bike.color = "red"; //менять поля можно
    }
}
