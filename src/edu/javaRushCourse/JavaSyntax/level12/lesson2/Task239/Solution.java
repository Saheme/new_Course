package edu.javaRushCourse.JavaSyntax.level12.lesson2.Task239;

import edu.javaRushCourse.JavaSyntax.level12.lesson2.Task239.SolarSystem;

/**
 *Программа выводит на экран основные факты о Солнечной системе.
 * Перепиши код так, чтобы в выводе использовались все переменные класса SolarSystem, но результат работы программы при этом не изменился.
 *
 * Ожидаемый вывод:
 * Человечество живет в Солнечной системе.
 * Ее возраст около 4568200000 лет.
 * В Солнечной системе 8 известных планет.
 * Как и большинство звездных систем, состоит из 1 звезды.
 * Звезды по имени Солнце.
 * Расстояние к центру галактики составляет 27170 световых лет.
 * Каждый обитатель Солнечной системы должен знать эту информацию!
 *
 * Требования:
 * •	Программа должна выводить на экран текст, указанный в примере.
 * •	При выводе текста нужно использовать все переменные класса SolarSystem.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("Человечество живет в Солнечной системе.");
        System.out.printf("Ее возраст около %d лет. \n", SolarSystem.age);
        System.out.printf("В Солнечной системе %d известных планет.\n",SolarSystem.planetsCount);
        System.out.printf("Как и большинство звездных систем, состоит из %d звезды.\n",SolarSystem.starsCount);
        System.out.printf("Звезды по имени %s.\n",SolarSystem.starName);
        System.out.printf("Расстояние к центру галактики составляет %d световых лет.\n",SolarSystem.galacticCenterDistance);
        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");

    }
}
