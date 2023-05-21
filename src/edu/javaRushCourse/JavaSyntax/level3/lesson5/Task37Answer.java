package edu.javaRushCourse.JavaSyntax.level3.lesson5;

import java.util.Scanner;

public class Task37Answer {
    public static void main(String[] args) {
        // создаем объект класса Scanner для считывания с клавиатуры
        Scanner scanner = new Scanner(System.in);
        // объявляем переменные типа int и присваиваем им числа считанные с
        // клавиатуры
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        // проверяем условие num1 > 0, если правдиво (true), то
        if (num1 > 0) {
            // выводим на экран значение переменной num1
            System.out.println(num1);
        }
        // проверяем условие num2 > 0, если правдиво (true), то
        if (num2 > 0) {
            // выводим на экран значение переменной num2
            System.out.println(num2);
        }
        // проверяем условие num3 > 0, если правдиво (true), то
        if (num3 > 0) {
            // выводим на экран значение переменной num3
            System.out.println(num3);
        }
        // проверяем условие num4 > 0, если правдиво (true), то
        if (num4 > 0) {
            // выводим на экран значение переменной num4
            System.out.println(num4);
        }
    }
}
