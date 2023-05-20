package edu.javaCourse.lesson_22.encapsulation.homeWork.second;

public class Pet extends Animal {
    String name;
    int tail = 1;
    int paw = 4;

    public Pet() {
        eyes =2;
        System.out.println("I'm pet.");
    }

    public void run() {
        System.out.println("Pet runs");
    }

    public void jump() {
        System.out.println("Pet jumps");
    }
}

