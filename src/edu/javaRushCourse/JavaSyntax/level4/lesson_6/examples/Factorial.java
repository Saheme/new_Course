package edu.javaRushCourse.JavaSyntax.level4.lesson_6.examples;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int factorial =1;
        for (int i = 1; i <= number; i++) {
            factorial *=i;
        }
        System.out.println(factorial);
    }
}
