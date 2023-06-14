package edu.javaRushCourse.JavaSyntax.level12.lesson5;

/**
 * Исправь ошибки в коде, чтобы программа компилировалась и работала.
 *
 * Требования:
 * •	Программа должна компилироваться и работать.
 * •	В программе должен быть публичный класс Solution.
 * •	В программе должен быть класс C
 */
public class Task257 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name);
    }
}
 class Cat {
    String name = "Tom";
}

