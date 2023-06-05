package edu.javaRushCourse.JavaSyntax.level8.lesson4;

import java.util.Scanner;

/**
 * Используя оператор new в методе main(), создай:
 *
 * 10 объектов типа String;
 * 5 объектов типа int[] (массивов значений int);
 * 2 объекта типа Scanner.
 * Требования:
 * •	В методе main() должно создаваться 10 объектов типа String.
 * •	В методе main() должно создаваться 5 объектов типа int[].
 * •	В методе main() должно создаваться 2 объекта типа Scanner.
 */
public class Task159 {
    public static void main(String[] args) {
        String first = new String("one");
        String second = new String("two");
        String third = new String("three");
        String fourth = new String("four");
        String fifth = new String("five");
        String sixth = new String("six");
        String seventh = new String("seven");
        String eighth = new String("eight");
        String ninth = new String("nine");
        String tenth = new String("ten");

        int [] array1 = new int[3];
        int [] array2 = new int[43];
        int [] array3 = new int[6];
        int [] array4 = new int[7];
        int [] array5 = new int[2];

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
    }
}
