package edu.javaCourse.lesson_25_polymorphism.homeWork;

public class Leon extends Mammal {
    public Leon(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("Lev eto ne samay bystray koshka");
    }

    @Override
    public void eat() {
        System.out.println("Lev est myso");
    }

    @Override
    void sleep() {
        System.out.println("Lev mnogo spit");
    }
}
