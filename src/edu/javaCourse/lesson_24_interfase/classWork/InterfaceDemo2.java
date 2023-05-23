package edu.javaCourse.lesson_24_interfase.classWork;

public class InterfaceDemo2 {
    public static void main(String[] args) {
        AbleJump ab1 = new Animal();
        AbleJump ab2 = new Human();
    }
}

class Human implements AbleJump {
    @Override
    public void jump() {
        System.out.println("Human jumps");
    }
}

class Animal implements AbleJump {
    @Override
    public void jump() {
        System.out.println("Animal jumps");
    }
}

interface AbleJump {
    void jump();
}

interface A extends AbleJump{
    void abc();
}
interface B extends A,AbleJump{}

abstract class D implements B {}

class Test extends D{

    @Override
    public void jump() {

    }

    @Override
    public void abc() {

    }
}