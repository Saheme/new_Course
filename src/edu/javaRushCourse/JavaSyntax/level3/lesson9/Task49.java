package edu.javaRushCourse.JavaSyntax.level3.lesson9;

import java.util.Scanner;

/**
 * Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки.
 * <p>
 * Требования:
 * •	Программа должна считывать две строки c клавиатуры.
 * •	Если строки одинаковые, то программа должна вывести сообщение "строки одинаковые".
 * •	Если строки разные, то программа должна вывести сообщение "строки разные".
 */
public class Task49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        if (str1.equals(str2)) {
            System.out.println("строки одинаковые");
        } else {
            System.out.println("строки разные");
        }
    }
}
