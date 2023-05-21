package edu.javaRushCourse.JavaSyntax.level2.lesson8.scaner.classWork;

import java.util.Scanner;

public class ReadInString {
    public static void main(String[] args) {
        String numbers = "10 25 50 100";
        Scanner scan = new Scanner(numbers);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = num1 + num2;
        System.out.println("num1 : " + num1 + " " + "num2 : " + num2 + " " + "summa : " +  result);
    }
}
