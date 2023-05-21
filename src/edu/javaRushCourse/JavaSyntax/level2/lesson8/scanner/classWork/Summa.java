package edu.javaRushCourse.JavaSyntax.level2.lesson8.scanner.classWork;

import java.util.Scanner;

public class Summa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = num1 + num2;
        System.out.println(result);
    }
}
