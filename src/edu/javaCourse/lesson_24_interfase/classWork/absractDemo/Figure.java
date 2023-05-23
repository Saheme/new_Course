package edu.javaCourse.lesson_24_interfase.classWork.absractDemo;

 abstract class Figure {  // фигура
    public final static double  PI = Math.PI;
     int numberOfSides;  // переменная содержащая количество сторон




     abstract void perimeter();


     abstract void area();  //площадь

     void showInfo(){
         System.out.println("This is a figure.");
     }


 }
