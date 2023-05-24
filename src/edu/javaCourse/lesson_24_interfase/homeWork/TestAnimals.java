package edu.javaCourse.lesson_24_interfase.homeWork;

public class TestAnimals {
    public static void main(String[] args) {
        Mechenosec mech = new Mechenosec("Ubu");
        mech.eat();
        mech.swim();
        mech.sleep();

        System.out.println();

        Speakable sp = new Penguin("penguin");
        sp.speak();

        System.out.println();

        Animal animal = new Leon("leon");
        animal.eat();
        animal.sleep();

        System.out.println();

        Mammal mam = new Leon("leon2");
        mam.run();
        mam.speak();
        mam.eat();
        mam.sleep();
    }
}
