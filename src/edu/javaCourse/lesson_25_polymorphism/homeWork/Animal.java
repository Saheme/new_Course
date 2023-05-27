package edu.javaCourse.lesson_25_polymorphism.homeWork;


public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    abstract void sleep();
}
