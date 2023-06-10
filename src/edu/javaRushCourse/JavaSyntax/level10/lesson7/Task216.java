package edu.javaRushCourse.JavaSyntax.level10.lesson7;

/**
 * Используя StringBuilder в методе reverseString(String), разверни строку, полученную как параметр.
 *
 * Требования:
 * •	Нужно, чтобы метод reverseString(String) использовал StringBuilder.
 * •	Нужно, чтобы метод reverseString(String) возвращал развернутую строку.
 */
public class Task216 {
    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder sb =new StringBuilder(string);
        sb.reverse();
        return sb.toString();
    }
}
