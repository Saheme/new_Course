package edu.javaRushCourse.JavaSyntax.level6.lesson8;

import java.util.Arrays;

/**

 * В этой части в классе Solution нужно создать публичные статические переменные типа int:
 *
 * width, это будет ширина поля (количество столбцов);
 * height, это будет высота поля (количество строк).
 * Переменной width присвой значение 30, а переменной height — 10. Само поле будет представлять собой двумерный массив элементов типа String.
 * Создай публичную статическую переменную field соответствующего типа и проинициализируй ее значением массива с размерностью height*width.
 * В методе main заполни массив элементами со значением, равным значению переменной empty. Выведи массив на экран как показано в примере.
 * Пример вывода на экран массива размерностью 5*3, значение каждого элемента равно "e":
 * eeeee
 * eeeee
 * eeeee
 *
 * Требования:
 * •	В классе Solution должна быть публичная статическая переменная width типа int, проинициализированная при объявлении значением 30.
 * •	В классе Solution должна быть публичная статическая переменная height типа int, проинициализированная при объявлении значением 10.
 * •	В классе Solution должна быть публичная статическая переменная field типа String[][], проинициализированная при объявлении двумерным массивом с размерностью height*width.
 * •	В методе main класса Solution массив field должен быть заполнен элементами, равными empty.
 * •	В методе main класса Solution массив field должен быть выведен на экран согласно условию.
 */
public class Task106 {

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
            for (String[] symbol : field) {
                for (String line : symbol) {
                    System.out.print(line);
                }
                System.out.println();
            }
        }
    }
