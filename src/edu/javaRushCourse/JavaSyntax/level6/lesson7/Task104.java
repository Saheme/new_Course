package edu.javaRushCourse.JavaSyntax.level6.lesson7;

/**
 * Дан двумерный массив array (массив, который хранит ссылки на массивы-строки).
 * Необходимо его проинициализировать массивами-строками, длина которых равна 2 * <номер массива-строки> + 1.
 * То есть array[0] будет иметь длину 2 * 0 + 1 = 1, array[1] будет иметь длину 2 * 1 + 1 = 3 и т. д.
 * Заполни все массивы-строки числами, которые равны номеру элемента в массиве-строке + номер самой строки. Массив-строка под номером 3 будет заполнена вот так:
 * {3, 4, 5, ...}
 * (0+3, 1+3, 2+3, ...)
 * <p>
 * Требования:
 * •	В классе Solution должна быть публичная статическая переменная int[][] array, проинициализированная значением int[5][].
 * •	Проинициализируй массивы-строки, которые хранит переменная array, массивами необходимой длины (смотри условие).
 * •	Заполни массивы-строки числами согласно условию.
 */
public class Task104 {
    public static int[][] array = new int[5][];
    public static void main(String[] args) {
        for (int i = 0; i < array.length ; i++) {
            int size = 2*i+1;
            array[i] = new int[size];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i+j;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//    int size = 2*i+1;
//            array[i] = new int[size];