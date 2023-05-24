package edu.javaCourse.lesson_24_interfase.homeWork;

public interface Speakable {

    default void speak(){
        System.out.println("Somebody speaks");
    }
}
