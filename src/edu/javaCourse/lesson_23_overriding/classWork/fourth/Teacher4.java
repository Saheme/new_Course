package edu.javaCourse.lesson_23_overriding.classWork.fourth;

import edu.javaCourse.lesson_23_overriding.classWork.first.Employee;

public class Teacher4 extends Employee4 {

    String extendExperience;

    public  void  teach(){
        System.out.println("He's teaching");
    }

  /*  public void eat() {
        System.out.println("He's eating some meat");
    }*/
    static void shopping(){
        System.out.println("Teacher is shopping.");
    }
}
