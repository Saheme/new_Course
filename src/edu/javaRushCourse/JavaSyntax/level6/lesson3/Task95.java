package edu.javaRushCourse.JavaSyntax.level6.lesson3;

import java.util.Scanner;

/**
 * В этой задаче тебе нужно:
 * <p>
 * Ввести с клавиатуры число N.
 * Считать N целых чисел и заполнить ими массив array.
 * Найти максимальное число среди элементов массива.
 * Требования:
 * •	В методе main(String[]) считай с клавиатуры число N, потом проинициализируй массив array размером N элементов, и заполни числами с клавиатуры.
 * •	В методе main(String[]) выведи в консоль максимальное число среди элементов массива.
 */
public class Task95 {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        int max = Integer.MIN_VALUE;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
