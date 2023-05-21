package edu.javaRushCourse.JavaSyntax.level2.lesson8.scaner;

import java.util.Scanner;

/**
 * Считай с клавиатуры три целых числа.
 * Выведи на экран их среднее арифметическое.
 * <p>
 * Пример ввода:
 * <p>
 * 51
 * 101
 * 201
 * Пример вывода:
 * <p>
 * 117
 * Среднее арифметическое - это число, равное сумме всех чисел, деленной на их количество.
 * Используй деление без остатка.
 * <p>
 * Требования:
 * •	Программа должна считывать с клавиатуры три целых числа.
 * •	Программа должна выводить на экран среднее арифметическое считанных чисел.
 */
public class Task31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        System.out.println((num1 + num2 + num3) / 3);
    }
}
