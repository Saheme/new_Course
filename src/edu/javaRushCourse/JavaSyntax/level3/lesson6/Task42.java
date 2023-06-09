package edu.javaRushCourse.JavaSyntax.level3.lesson6;

import java.util.Scanner;

/**
 * Напишем программу, которая будет считывать с клавиатуры возраст. Если возраст от 20 до 60 (включительно),
 * то выводить ничего не нужно, иначе - вывести фразу "можно не работать". Сделать это можно (и нужно!) с помощью только одного оператора if без else.
 * <p>
 * Подсказка: используй логический оператор "||" (или).
 * <p>
 * Требования:
 * •	Программа должна считывать одно число c клавиатуры.
 * •	Если возраст меньше 20 или больше 60, то нужно вывести фразу "можно не работать".
 * •	Если возраст в диапазоне от 20 до 60 (включительно), то выводить ничего не нужно.
 * •	В программе должен использоваться один оператор if без else и логический оператор ||.
 */
public class Task42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        boolean young = age < 20;
        boolean old = age > 60;
        if (young || old) {
            System.out.println("можно не работать");
        }
    }
}
