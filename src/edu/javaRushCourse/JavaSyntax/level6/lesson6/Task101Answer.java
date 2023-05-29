package edu.javaRushCourse.JavaSyntax.level6.lesson6;

import java.util.Scanner;

/**
 * Считывает из консоли число N — количество строк массива (считай, что это число будет больше 0, можно не проверять).
 * Считывает N чисел из консоли (любые числа, которые будут больше 0, можно не проверять).
 * Инициализирует двумерный массив multiArray:
 * количеством строк N;
 * строки — массивами, размер которых соответствует числам, введенным в п.2 (в порядке ввода).
 * Пример:
 * <p>
 * Введено число 5.
 * Введены числа 1, 7, 5, 9, 3.
 * Получаем такой массив:
 * []
 * [][][][][][][]
 * [][][][][]
 * [][][][][][][][][]
 * [][][]
 * Требования:
 * •	В классе Solution должна быть не проинициализированная публичная статическая переменная multiArray типа int[][].
 * •	Метод main(String[]) должен считывать числа с клавиатуры согласно условию.
 * •	В методе main(String[]) создай двумерный массив согласно условию
 */
public class Task101Answer {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        multiArray = new int[n][];
        for (int i = 0; i < n; i++) {
            int size = Integer.parseInt(scanner.nextLine());
            multiArray[i] = new int[size];
        }
    }
}

