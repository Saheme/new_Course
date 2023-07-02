package edu.javaRushCourse.JavaSyntax.level6.lesson7;

import java.util.Arrays;

/**
 * Кибердракон почти готов, осталось только починить код энергоблока, блока управления и основного орудия.
 * Также нужно пофиксить код поведения Кибердракона, чтобы разгромить флотилию галаксианских багов.
 * Амиго и Диего вроде все сделали, но, видимо, еще остались ошибки. Помоги героям исправить ошибки, чтобы в консоль вывелось:
 * [[A, L, L], [G, A, L, A, B, U, G, S], [W, E, R, E], [D, E, S, T, R, O, Y, E, D]]
 * Используй необходимые методы класса Arrays.
 *
 * Требования:
 * •	Названия, тип, модификаторы и значения переменных rockets, galabugs и message изменять нельзя.
 * •	Исправь ошибки в программе используя методы deepEquals и deepToString класса Arrays.
 * •	Программа должна вывести в консоль текст согласно условию.
 */
public class Task105 {
    public static int[][] rockets = {{0,1,1,1,0,0,0,1},{1,0,0,0,1,1,1,0,1,1},{1,0,1,1,0,0,1,1,1,0},{0,1,1,1,0,1,1,1,0,1,0}};
    public static int[][] galabugs = {{0,1,1,1,0,0,0,1},{1,0,0,0,1,1,1,0,1,1},{1,0,1,1,0,0,1,1,1,0},{0,1,1,1,0,1,1,1,0,1,0}};
    public static char[][] message = {
            {'A','L','L'},
            {'G','A','L','A','B','U','G','S'},
            {'W','E','R','E'},
            {'D','E','S','T','R','O','Y','E','D'}
    };

    public static void main(String[] args) {
        if (Arrays.deepEquals(rockets,galabugs)) {
            System.out.println(Arrays.deepToString(message));
        }
    }
}