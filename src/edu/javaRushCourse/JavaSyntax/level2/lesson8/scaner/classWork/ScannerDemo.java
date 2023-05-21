package edu.javaRushCourse.JavaSyntax.level2.lesson8.scaner.classWork;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int number = scan.nextInt();
        System.out.println("String :" + str);
        System.out.println("Number : " + number);
    }
}
