package edu.javaCourse.lesson_25_polymorphism.homeWork;

public interface Speakable {

    default void speak(){
        System.out.println("Somebody speaks");
    }
}
