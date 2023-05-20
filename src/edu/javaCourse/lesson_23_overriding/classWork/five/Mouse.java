package edu.javaCourse.lesson_23_overriding.classWork.five;

public class Mouse extends Animal{

     String showName(){
        return "Jerry";
    }

    void showInfoAboutMouse(){
        System.out.println("Name of mouse is : " + showName());
    }


}
