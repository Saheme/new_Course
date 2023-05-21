package edu.javaRushCourse.JavaSyntax.level2.lesson8.scaner;

import java.util.Scanner;

/**
 * Нужно переключить такси на ручное управление.
 * Для этого считай с клавиатуры три числа и выведи их произведение в консоль.
 * <p>
 * Требования:
 * •	Программа должна считывать с клавиатуры три числа.
 * •	Программа должна выводить в консоль произведение считанных чисел.
 */
public class Task29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int result = num1 * num2 * num3;
        System.out.println("product of numbers : " + result);
    }
}
