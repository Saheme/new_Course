package edu.javaRushCourse.JavaSyntax.level3.lesson5;

import java.util.Scanner;

/**
 * По конвейеру едет мусор и еда. Манипулятор убирает еду и оставляет мусор.
 * Нужно написать код, чтобы манипулятор убирал мусор и оставлял еду.
 * <p>
 * Напиши программу, которая будет считывать 4 числа, и выводить в консоль только те, которые больше нуля (не включительно). Каждое число выводить с новой строки.
 * <p>
 * Требования:
 * •	Программа должна считывать с клавиатуры четыре числа.
 * •	Выведи в консоль только положительные числа, каждое с новой строки.
 */
public class Task37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int num = scan.nextInt();
            if (num>0){
                System.out.println(num);
            }
        }
    }
}
