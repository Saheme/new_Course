package edu.javaRushCourse.JavaSyntax.level4.lesson6.examples;

import java.util.Scanner;

public class DownloadNumberWithLoop {
    public static void main(String[] args) {

        int number=0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            if (scan.hasNextInt()){
                number = scan.nextInt();
            }
        System.out.println(number + " ");
        }
    }
}
