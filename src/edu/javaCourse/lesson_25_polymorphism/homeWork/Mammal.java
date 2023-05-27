package edu.javaCourse.lesson_25_polymorphism.homeWork;

public abstract class Mammal extends Animal implements Speakable {
    public Mammal(String name) {
        super(name);
        this.name =name;
    }
    abstract void run();
}
