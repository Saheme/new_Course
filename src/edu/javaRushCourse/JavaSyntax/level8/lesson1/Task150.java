package edu.javaRushCourse.JavaSyntax.level8.lesson1;

/**
 * В методе main вызови метод div() с таким аргументом, чтобы вывод в консоли был "NaN".
 * Код метода div() изменять нельзя.
 *
 * Требования:
 * •	В методе main() должен вызываться метод div().
 * •	Результатом вызова метода div() должен быть вывод в консоли "NaN".
 * •	Код метода div() не изменяй.
 */
public class Task150 {
    public static void main(String[] args) {
        div(0.0,0.0);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
