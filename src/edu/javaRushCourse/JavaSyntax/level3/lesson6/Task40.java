package edu.javaRushCourse.JavaSyntax.level3.lesson6;

import edu.javaCourse.lesson_10.homeWork.p4.D;

import java.util.Scanner;

/**
 * Нужно перепрограммировать код для выращивания искусственного мяса и ограничить выращивание по времени, иначе мясо превращается в мясного монстра Протодактиля.
 * <p>
 * Напиши программу, которая будет считывать количество времени с начала выращивания мяса.
 * С консоли должно вводиться два числа: часы и минуты. Затем нужно вывести в консоль следующий результат:
 * <p>
 * если прошло полчаса с начала выращивания мяса, то вывести:
 * Искусственное мясо готово.
 * если меньше, чем полчаса:
 * Искусственное мясо еще не готово.
 * если больше, чем полчаса:
 * Искусственное мясо превратилось в мясного монстра!
 * Для вывода можешь использовать статические переменные в классе Solution.
 * Введенные с консоли числа будут неотрицательными, и это проверять не нужно.
 * Требования:
 * •	Программа должна считывать с клавиатуры 2 числа.
 * •	Вывод должен быть согласно условию
 */
public class Task40 {
    public static String NOT_YET = "Искусственное мясо еще не готово.";
    public static String DONE = "Искусственное мясо готово.";
    public static String HORRIBLY_DONE = "Искусственное мясо превратилось в мясного монстра!";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int minutes = scan.nextInt();
        boolean onTime = (hour == 0) && (minutes == 30);
        boolean notYet = (hour == 0) && (minutes < 30);
        if (onTime) {
            System.out.println(DONE);
        } else if (notYet) {
            System.out.println(NOT_YET);
        } else {
            System.out.println(HORRIBLY_DONE);
        }

    }
}
