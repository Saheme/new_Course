package edu.javaRushCourse.JavaSyntax.level4.Lesson5;

import java.util.Scanner;

/**
 * Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
 * Выведи на экран минимальное число из введенных. Если введено несколько таких чисел, необходимо вывести любое из них.
 * <p>
 * Пример ввода:
 * 8
 * 4
 * 9
 * 4
 * 5
 * e
 * <p>
 * Пример вывода:
 * 4
 * Требования:
 * •	Программа должна считывать числа c клавиатуры.
 * •	Программа должна выводить число на экран.
 * •	Программа должна выводить на экран минимальное из введенных целых чисел.
 * •	Если введено несколько минимальных чисел, необходимо вывести любое.
 * •	Если введен только один нечисловой символ, то вывести на экран максимальное значение числа типа int.
 * •	Считывать данные с клавиатуры необходимо в цикле while.
 */
public class Task63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while (scan.hasNextInt()) {
            int number = scan.nextInt();
            if (number < min) {
                min = number;
            }
        }
        System.out.println(min);
    }
}