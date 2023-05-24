package edu.javaRushCourse.JavaSyntax.level4.lesson8;

import java.util.Scanner;

/**
 * Напиши программу, которая считывает с клавиатуры целые числа и выводит их на экран, пока не введено число, кратное 10.
 * В программе нужно использовать цикл do-while.
 * <p>
 * Примечание:
 * Поскольку цикл do-while сначала выполняет команду, а потом проверяет условие, то число. кратное 10, тоже должно быть выведено на экран.
 * <p>
 * Требования:
 * •	Программа должна считать с клавиатуры целые числа.
 * •	В программе необходимо использовать цикл do-while.
 * •	Нужно выводить на экран считанные числа, пока не будет введено число кратное 10.
 */
public class Task73 {
    public static void main(String[] args) {
        Scanner bombInterface = new Scanner(System.in);
        int number;
        do {
            number = bombInterface.nextInt();
        System.out.println(number);
        } while (number % 10 != 0);
    }
}

