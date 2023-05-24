package edu.javaRushCourse.JavaSyntax.level4.Lesson5;

import java.util.Scanner;

/**
 * Нужно охладить ядро планеты. Для этого при разогреве ядра нужно подсчитать сумму четных чисел в диапазоне от 1 до 100 включительно с использованием цикла while.
 *
 * Таким образом настроить правильный обогрев планеты. Если систему не охладить, то она взрывается вместе с планетой.
 *
 * Требования:
 * •	Программа должна вывести в консоль сумму всех четных чисел от 1 до 100 включительно.
 * •	В программе необходимо использовать цикл while.
 */
public class Task61 {
    public static void main(String[] args) {
        int sum = 0;
        int value = 2;
        while (value<=100){
            if ((value %2) ==0){
                sum+=value;
            }
            value++;
        }
        System.out.println(sum);
    }
}
