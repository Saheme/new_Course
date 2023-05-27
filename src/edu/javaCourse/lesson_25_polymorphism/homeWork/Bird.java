package edu.javaCourse.lesson_25_polymorphism.homeWork;



public abstract class Bird extends Animal implements Speakable {

    public Bird(String name) {
        super(name);
        this.name =name;
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " sings");
    }

}
