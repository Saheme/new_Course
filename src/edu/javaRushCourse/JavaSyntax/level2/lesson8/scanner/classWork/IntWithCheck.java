package edu.javaRushCourse.JavaSyntax.level2.lesson8.scanner.classWork;

import java.util.Scanner;

public class IntWithCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number : ");
        if (scan.hasNextInt()) {
            int number = scan.nextInt();
            System.out.println("number : " +number);
        } else {
            System.out.println("You didn't enter a number");
        }
    }
}
