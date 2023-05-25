package edu.javaRushCourse.JavaSyntax.level6.lesson3.examples;

import java.util.Scanner;

/**
 * нужно ввести с клавиатуры 10 чисел и вывести их в обратном порядке.
 */
public class Ex1 {
    public static void main(String[] args) {


        int[] array = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
                array[i] = scan.nextInt();
        }
        for (int i = 4; i >= 0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
