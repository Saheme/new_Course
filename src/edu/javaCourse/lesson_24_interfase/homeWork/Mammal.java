package edu.javaCourse.lesson_24_interfase.homeWork;

public abstract class Mammal extends Animal implements Speakable {
    public Mammal(String name) {
        super(name);
    }
    abstract void run();
}
