package edu.javaCourse.lesson_24_interfase.classWork.absractDemo;

public class AbstractDemo {
    public static void main(String[] args) {
        Figure f1 = new Square();
        System.out.println(f1.numberOfSides);
        f1.area();
    }
}
