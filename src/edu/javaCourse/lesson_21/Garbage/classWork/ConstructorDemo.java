package edu.javaCourse.lesson_21.Garbage.classWork;

public class ConstructorDemo {
   ConstructorDemo(){
       System.out.println("Create object");
   }
}

class A{
    public static void main(String[] args) {
        ConstructorDemo cs = new ConstructorDemo();
    }
}
