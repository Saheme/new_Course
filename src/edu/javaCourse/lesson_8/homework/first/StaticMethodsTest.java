package edu.javaCourse.lesson_8.homework.first;

 class StaticMethods {

    public static int multiplicationNumbers(int a, int b, int c) {
        return a * b * c;
    }

    public static void divideNumbers(int a, int b) {
        System.out.println("Целое частное чисел a и b : " + (a / b));
        System.out.println("Остаток от деления a и b : " + (a % b));
    }
 }
 public class StaticMethodsTest{
     public static void main(String[] args) {
         int result1 = StaticMethods.multiplicationNumbers(1, 5, 2);
         System.out.println(result1);
         int result2 = StaticMethods.multiplicationNumbers(2, 4, 4);
         System.out.println(result2);
         System.out.println("-------------");
         StaticMethods.divideNumbers(45,12);
         StaticMethods.divideNumbers(14,8);
     }
 }






