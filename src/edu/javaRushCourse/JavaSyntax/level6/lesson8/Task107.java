package edu.javaRushCourse.JavaSyntax.level6.lesson8;

import java.util.Arrays;

/**
 * Давай расположим на поле роботанки с таким условием, что в одном ряду будет один роботанк, его позицию выбери сам.
 *
 * Например, для определения позиции можно воспользоваться генератором случайных чисел:
 *
 * int x = (int) (Math.random() * n);
 * таким образом в переменную x будет помещено случайное число в диапазоне от 0 (включая) до n (не включая).
 * Чтобы поместить роботанк на поле, нужно значение соответствующего элемента массива field заменить на значение переменной robotank.
 * Выведи на экран массив field с роботанками. Пустое поле при этом выводить не нужно.
 *
 * Требования:
 * •	В массиве field нужно расположить 10 роботанков.
 * •	В каждом ряду должен быть только один роботанк.
 * •	Массив field должен быть выведен на экран после расстановки роботанков.
 */
public class Task107 {
    public static String robotank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int height = 10;
    public static int width = 30;
    ;
    public static String[][] field = new String[height][width]; ;
    ;

    public static void main(String[] args) {

        for (int i = 0; i < field.length; i++) {
            Arrays.fill(field[i], empty);
        }
       String [][] field2 = Arrays.copyOf(field,height);
        for (int i = 0; i < field2.length; i++) {
            int a = (int) (Math.random() * 10);
            field2[i] = new String[a];

        }


        for (String[] symbol : field2) {
            for (String line : symbol) {
                System.out.print(line);
            }
            System.out.println();
        }
    }

}
