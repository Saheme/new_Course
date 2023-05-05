package edu.javaCourse.lesson_5.classWork.third;

public class Car2 {
    String color;
    String engine;

    Car2(){
        System.out.println("Object  created");
    }

    Car2(String color, String engine){
        this.color = color;
        this.engine = engine;
        System.out.println(color + " " + engine);
    }
}
