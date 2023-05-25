package edu.javaCourse.lesson_25_polymorphism.classWork.second;

public class Demo2 {
    public static void main(String[] args) {
        JumpAble j = new Man();
        Man man = new Man();
        Car car = new Car();

        if (j instanceof  JumpAble) System.out.println("Man is Jumpable");
        if (man instanceof  Human) System.out.println("man is Human");
       // if (car instanceof  Human) System.out.println("man is Human"); невозможно
    }

}


interface JumpAble{}

class Human implements JumpAble{}
class Man extends Human{}
class Car{}


