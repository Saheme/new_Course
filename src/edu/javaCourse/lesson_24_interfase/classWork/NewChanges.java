package edu.javaCourse.lesson_24_interfase.classWork;

public class NewChanges {

}

interface I5{
   private static void method1(){
        System.out.println("This is a static method");

    }

   default void method2(){
       method1();
   }
   static void method3(){
       method1();
   }

}
