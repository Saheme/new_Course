package edu.javaRushCourse.JavaSyntax.level3.lesson3;

import java.util.Scanner;

/**
 * Ввести с клавиатуры температуру на улице. Если температура меньше 0, вывести надпись "на улице холодно", иначе - вывести надпись "на улице тепло".
 * <p>
 * Требования:
 * •	Программа должна считывать значение температуры c клавиатуры.
 * •	Программа должна использовать команду System.out.println() или System.out.print().
 * •	Если температура меньше 0, вывести только сообщение "на улице холодно".
 * •	Если температура больше либо равна 0, вывести только сообщение "на улице тепло".
 */
public class Task33 {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        Scanner scan = new Scanner(System.in);
        int temperature = scan.nextInt();
        if (temperature < 0) {
            System.out.println(cold);
        } else {
            System.out.println(warm);
        }
    }
}
