package edu.javaRushCourse.JavaSyntax.level6.lesson3;

/**
 * Для уничтожения нам нужно взломать Кибердракона и передать ему координаты галаксианских багов, чтобы он атаковал их, как своих врагов.
 * Давай напишем программу для генерации такого массива. Нам известно, что галаксианские роботанки ездят по двое,
 * всего их 200, 100 отрядов по два танка, поэтому нужно проинициализировать и заполнить массив на 200 элементов числам по следующей схеме:
 * 0, 1, 10, 11, 20, 21, 30, 31, ..., 990, 991.
 * <p>
 * Решение
 * •	1)	Подставим в формулу i=0, получаем
 * coordinates[0*2] = 0*10; т.е. coordinates[0] = 0;
 * coordinates[0*2+1] = 0*10+1; т.е. coordinates[1] = 1.
 * 2) Подставим в формулу i=1, получаем
 * coordinates[1*2] = 1*10; т.е. coordinates[2] = 10;
 * coordinates[1*2+1] = 1*10+1; т.е. coordinates[3] = 11.
 * Таким образом, за 2 витка цикла получили 4 координаты:
 * coordinates[0] = 0; coordinates[1] = 1; coordinates[2] = 10; coordinates[3] = 11.
 * Далее все аналогично.
 */
public class Task92Answer {
    public static int[] coordinates;

    public static void main(String[] args) {
        coordinates = new int[200];
        for (int i = 0; i < 100; i++) {
            coordinates[i * 2] = i * 10;
            coordinates[i * 2 + 1] = i * 10 + 1;
        }

            for (int num : coordinates) {
                System.out.print(num + " ");
            }


    }
}


