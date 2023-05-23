package edu.javaRushCourse.JavaSyntax.level3.lesson9;

import java.util.Scanner;

/**
 * Амиго создал секретное слово для доступа к закрытой информации, но у него сломалась клавиатура,
 * и теперь невозможно набирать буквы в верхнем регистре.
 * Напиши программу, которая будет сравнивать введенную строку со строкой из переменной secret, не учитывая регистр.
 * Если введенная строка равна строке из переменной secret, программа выводит на экран сообщение "доступ разрешен". В ином случае - "доступ запрещен".
 * <p>
 * Требования:
 * •	Программа должна считывать строку c клавиатуры.
 * •	В классе Solution должна быть публичная статическая переменная secret типа String.
 * •	Если введенная строка и строка из переменной secret одинаковые, не учитывая регистр, то программа должна вывести сообщение "доступ разрешен".
 * •	Если введенная строка и строка из переменной secret разные, не учитывая регистр, то программа должна вывести сообщение "доступ запрещен".
 */
public class Task52 {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String result = str.equalsIgnoreCase(secret) ? "доступ разрешен" : "доступ запрещен";
        System.out.println(result);
    }
}
//        System.out.println("доступ разрешен");
//        //напишите тут ваш код
//        System.out.println("доступ запрещен");
