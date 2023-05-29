package edu.javaRushCourse.JavaSyntax.level6.lesson6;

/**
 * Создай треугольный массив, где значение каждого элемента — это сумма его индексов. Например:
 * array[7][3] = 7 + 3 = 10,
 * array[3][0] = 3 + 0 = 3.
 * <p>
 * Выведи массив на экран в следующем виде:
 * 0
 * 1 2
 * 2 3 4
 * 3 4 5 6
 * 4 5 6 7 8
 * 5 6 7 8 9 10
 * ...
 * Числа в строке разделены пробелом.
 * <p>
 * Задать треугольный массив можно следующим образом:
 * int[][] array = new int[10][];
 * array[0] = new int[1];
 * array[1] = new int[2];
 * array[2] = new int[3];
 * ...
 * <p>
 * Требования:
 * •	В методе main(String[]) двумерный массив result заполни числами согласно условию.
 * •	Выведенный текст должен содержать 10 строк.
 * •	Выведенные числа должны соответствовать условию.
 */
public class Task100 {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        for (int i = 0; i < result.length; i++) {
            int size = i + 1;
            result[i] = new int[size];
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = i + j;
            }
        }
        for (int[] line : result) {
            for (int num : line) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
