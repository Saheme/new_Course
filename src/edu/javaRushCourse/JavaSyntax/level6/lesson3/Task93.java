package edu.javaRushCourse.JavaSyntax.level6.lesson3;

import java.util.Scanner;

/**
 * Тебе нужно написать программу, которая:
 * <p>
 * Считывает с консоли целое число N.
 * Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
 * Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
 * Каждое число выводить с новой строки. Число N выводить не нужно.
 * Требования:
 * •	Программа должна считывать число N и за ним еще N чисел.
 * •	В классе должен быть метод public static void main(String[]).
 * •	Нельзя добавлять новые методы в класс Solution.
 * •	Программа должна выводить введенные N чисел в обратном порядке, если N чётное.
 * •	Программа должна выводить введенные N чисел в том же порядке, если N нечётное.
 */
public class Task93 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        if (!(number % 2 == 0)) {
            for (int val : array) {
                System.out.println(val);
            }
        } else {
            for (int i = array.length-1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        }
    }
}


