package edu.javaCourse.lesson_23_overriding.classWork.second;

import edu.javaCourse.lesson_23_overriding.classWork.first.Employee;

public class Teacher3 extends Employee {

    String extendExperience;

    public  void  teach(){
        System.out.println("He's teaching");
    }
    public void eat() {
        System.out.println("He's eating some meat");
    }

    Fruit eatFood(){
        System.out.println("Teacher is eating something food");
        return new Fruit();
    }

}
