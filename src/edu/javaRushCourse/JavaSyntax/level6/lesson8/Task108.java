package edu.javaRushCourse.JavaSyntax.level6.lesson8;

import java.util.Arrays;

/**
 * Теперь займемся бомбами. Идея "бомбардировки" такова — каждая бомба попадает в соответствующую ячейку поля.
 * <p>
 * Создадим массив чисел (публичная статическая переменная bombs типа int[][]) такой же размерности как и у поля (field), который будет содержать числа:
 * <p>
 * 0 — в ячейке нет бомбы;
 * 1 — в ячейке есть бомба.
 * Заполни массив бомбами так, чтобы в каждой строке было 10 бомб.
 * Требования:
 * •	В классе Solution должна быть публичная статическая переменная bombs типа int[][], проинициализированная при объявлении двумерным массивом с размерностью height*width.
 * •	В методе main класса Solution массив bombs должен быть заполнен элементами согласно условию.
 */
public class Task108 {
    public static String robotank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int height = 10;
    public static int width = 30;
    ;
    public static String[][] field = new String[height][width];
    public static int[][] bombs = new int[height][width];

    public static void main(String[] args) {

        for (int i = 0; i < field.length; i++) {
            Arrays.fill(field[i], empty);
        }
        for (int i = 0; i < field.length; i++) {
            int a = (int) (Math.random() * width);
            field[i][a] = robotank;
        }
        for (int i = 0; i < bombs.length; i++) {
            Arrays.fill(bombs[i], 0);
            for (int j = 0; j < 10; j++) {
                int a = (int) (Math.random() * width);
                if (bombs[i][a] == 0) {
                    bombs[i][a] = 1;

                } else {
                    j--;
                }
            }

            for (String[] symbol : field) {
                for (String line : symbol) {
                    System.out.print(line);
                }
                System.out.println();
            }
            System.out.println();
            for (int[] symbol : bombs) {
                for (int line : symbol) {
                    System.out.print(line + " ");
                }
                System.out.println();
            }
        }
    }
}
