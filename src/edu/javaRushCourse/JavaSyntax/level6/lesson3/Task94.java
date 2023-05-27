package edu.javaRushCourse.JavaSyntax.level6.lesson3;

import java.util.Scanner;

/**
 * Чтобы выполнить эту задачу, тебе нужно:
 * <p>
 * Ввести с клавиатуры число N.
 * Считать N целых чисел и заполнить ими массив.
 * Найти минимальное число среди элементов массива и вывести в консоль.
 * Требования:
 * •	В методе main(String[]) считай с клавиатуры число N, потом проинициализируй массив array размером N элементов и заполни числами с клавиатуры.
 * •	В методе main(String[]) выведи в консоль минимальное число среди элементов массива.
 */
public class Task94 {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        int min = Integer.MAX_VALUE;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
