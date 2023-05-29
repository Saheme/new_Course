package edu.javaRushCourse.JavaSyntax.level6.lesson6;

import java.util.Arrays;

/**
 * Диего оказался заражен галабагами. Давай поможем Амиго очистить Диего от вирусов с помощью массивов.
 * <p>
 * Проинициализируй двумерный массив при объявлении любыми значениями (рекомендуем использовать быструю инициализацию).
 * Размерность массива должна быть 3х4 (высота-ширина). Переверни массив зеркально относительно центральной строки.
 * <p>
 * Например, ты заполнил массив таким образом:
 * {
 * {1,2,3,4},
 * {4,5,6,7},
 * {7,8,9,0}
 * }
 * <p>
 * Тогда зеркально перевернутый массив будет выглядеть вот так:
 * {
 * {7,8,9,0},
 * {4,5,6,7},
 * {1,2,3,4}
 * }
 * <p>
 * Требования:
 * •	В классе Solution должна быть публичная статическая переменная array типа int[][].
 * •	Проинициализируй переменную array при объявлении согласно условию.
 * •	Переверни массив array зеркально относительно центральной строки (смотри пример в условии).
 */
public class Task99 {
    public static int[][] array;

    public static void main(String[] args) {

        array = new int[][]{{1, 2, 3, 4},
                            {4, 5, 6, 7},
                            {7, 8, 9, 0}};
        printArray();
        int[][] array2 = new int[3][4];

        array2[2] = array[0];
        array2[1] = array[1];
        array2[0] = array[2];
        array = array2;

        printArray();
    }

    public static void printArray() {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}

//        int [][] array2 = new int[3][4];
//
//        array2[2] = array[0];
//        array2[1] = array[1];
//        array2[0] = array[2];
//        array =array2;