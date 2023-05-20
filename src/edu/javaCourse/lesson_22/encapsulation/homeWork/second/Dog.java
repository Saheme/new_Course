package edu.javaCourse.lesson_22.encapsulation.homeWork.second;

public class Dog extends Pet{

    public Dog(String name) {
        this.name = name;
        System.out.println("I'm a dog my name is : " + name);
    }



    public void play(){
        System.out.println("Dog plays.");
    }
}
