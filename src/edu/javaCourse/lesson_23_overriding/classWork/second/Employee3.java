package edu.javaCourse.lesson_23_overriding.classWork.second;

public class Employee3 {
    String name;
    int age;
    int experience;
    double salary= 100;

    public void eat() {
        System.out.println("He's eating");
    }

    Food eatFood(){
        System.out.println("Employee is eating something food");
        Food food = new Food();
        return food;
    }

    public void sleep() {
        System.out.println("He's sleeping ");
    }
}
