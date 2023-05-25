package edu.javaRushCourse.JavaSyntax.level6.lesson2;

/**
 * Дан массив чисел. В методе main нужно посчитать:
 * <p>
 * х — сумму всех нечетных элементов массива
 * у — сумму всех четных элементов массива
 * и вывести в виде: (х;у)
 * Требования:
 * •	В классе Solution должна быть публичная статическая переменная coordinates типа int[] проинициализирована массивом чисел.
 * •	В методе main(String[]) необходимо посчитать и вывести на экран суммы четных и нечетных элементов массива согласно условию.
 */
public class Task90 {
    public static int[] coordinates = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        int x = 0;  //нечет
        int y = 0;  // чет
        for (int i = 0; i < coordinates.length; i++) {
            if (coordinates[i] % 2 == 0) {
                y += coordinates[i];
            }
            if (coordinates[i] % 2 != 0) {
                x += coordinates[i];
            }
        }
        System.out.println("(" + x + ";" + y + ")");
    }
}
