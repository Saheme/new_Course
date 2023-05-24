package edu.javaRushCourse.JavaSyntax.level4.Lesson5.examples;
/**
 * нахождение max
 */

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (scan.hasNextInt()){
            int number = scan.nextInt();
            if (number>max){
                max =number;
            }
        }
        System.out.println(max);
    }
}
