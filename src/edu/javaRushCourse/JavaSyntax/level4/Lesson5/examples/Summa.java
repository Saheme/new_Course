package edu.javaRushCourse.JavaSyntax.level4.Lesson5.examples;

import java.util.Scanner;

public class Summa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        while (scan.hasNextInt()){
            int number = scan.nextInt();
            sum +=number;
        }
        System.out.println(sum);
    }
}
