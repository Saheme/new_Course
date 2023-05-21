package edu.javaRushCourse.JavaSyntax.level3.lesson5;

import java.util.Scanner;

/**
 * Ввести с клавиатуры три целых числа. Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
 * Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
 * <p>
 * Примеры:
 * a) при вводе чисел 1 2 2 получим вывод 2 2
 * <p>
 * b) при вводе чисел 2 2 2 получим вывод 2 2 2
 * Требования:
 * •	Программа должна считывать три числа c клавиатуры.
 * •	Программа должна содержать System.out.println() или System.out.print()
 * •	Если два числа равны между собой, необходимо вывести их на экран.
 * •	Если все три числа равны между собой, необходимо вывести все три.
 * •	Если нет равных чисел, ничего не выводить.
 */
public class Task39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a == b && b == c) {
            System.out.println(a + " " + b + " " + c);
        }else if (a == b) {
            System.out.println(a + " " + b);
        } else if (b == c) {
            System.out.println(b + " " + c);
        } else if (a == c) {
            System.out.println(a + " " + c);
        }

    }
}

