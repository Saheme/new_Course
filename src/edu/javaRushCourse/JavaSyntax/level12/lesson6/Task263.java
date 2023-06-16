package edu.javaRushCourse.JavaSyntax.level12.lesson6;

import java.util.Arrays;

/**
 * В программе массив заполняется числами от 0 до 9 и выводится на экран. Но из-за ошибки программа не компилируется.
 * Сделай так, чтобы программа компилировалась и работала правильно.
 *
 * Требования:
 * •	Исправь ошибку, что бы программа работала корректно.
 */
public class Task263 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}
