package edu.javaRushCourse.JavaSyntax.level4.lesson10;

import java.util.Scanner;

/**
 * Ввести с клавиатуры положительное целое число radius. Это будет радиус окружности.
 * Вывести на экран площадь круга, рассчитанную по формуле: S = pi * radius * radius.
 * Результатом должно стать целое число (тип int). Для этого нужно привести к типу int результат умножения (отбросить дробную часть, округлив вниз до целого числа).
 * В качестве значения pi используй 3.14.
 * <p>
 * Пример ввода:
 * 5
 * <p>
 * Пример вывода:
 * 78
 * <p>
 * Требования:
 * •	Программа должна считывать целое число c клавиатуры.
 * •	Программа должна выводить число на экран.
 * •	Программа должна выводить на экран площадь круга радиусом radius, приведенную к целому числу.
 */
public class Task78 {
    public final static double PI = 3.14;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int radius = scan.nextInt();
        int result = (int) (PI * Math.pow(radius, 2));
        System.out.println(result);
    }
}

