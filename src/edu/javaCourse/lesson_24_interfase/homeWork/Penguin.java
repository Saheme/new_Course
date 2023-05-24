package edu.javaCourse.lesson_24_interfase.homeWork;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println("penguin ne umeyut letat");
    }

    @Override
    void eat() {
        System.out.println("Penguin lubit est ribu");
    }

    @Override
    void sleep() {
        System.out.println("Pinguin spyt prijavshis drug k drugu");
    }
    public void speak() {
        System.out.println("Penguin ne umeyut pet kak soloviy");
    }

}
