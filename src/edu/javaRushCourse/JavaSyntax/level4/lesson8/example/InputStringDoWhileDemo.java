package edu.javaRushCourse.JavaSyntax.level4.lesson8.example;

import java.util.Scanner;

public class InputStringDoWhileDemo {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String str;
        do {
            str=scan.nextLine();
        }while (!str.equals("ex"));
        System.out.println(str);
    }
}
