package edu.javaRushCourse.JavaSyntax.level6.lesson6;

/**
 * В методе main(String[]) выведи на экран все числа из трехмерного массива multiArray.
 *
 * Требования:
 * •	В классе Solution должна быть публичная статическая переменная multiArray типа int[][][].
 * •	В методе main(String[]) выведи на экран все числа из multiArray.
 */
public class Task102 {
    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        for (int[][] line : multiArray) {
            for (int [] line2: line) {
                for (int num: line2) {
                    System.out.print(num +" ");
                }
            }
            System.out.println();
        }
    }
}
