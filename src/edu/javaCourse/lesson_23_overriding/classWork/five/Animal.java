package edu.javaCourse.lesson_23_overriding.classWork.five;

public class Animal {

     String showName(){
        return "Some animal";
    }

    void showInfoAboutAnimal(){
        System.out.println("Name of animal is : " + showName());
    }
}
