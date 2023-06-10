package edu.javaRushCourse.JavaSyntax.level11.lesson1.Task217;

import java.util.Arrays;

/**
 * Среди пустырей и развалин нужно как-то победить робозомби, которые сбредаются к Амиго и Диего со всей округи.
 *
 * Кстати, склады на планете Пепл под завязку забиты батарейками, но безмозглые робозомби не видят их у себя под носом. Давай организуем раздачу батареек,
 * и, возможно, робозомби успокоятся.
 *
 * Требования:
 * •	Нельзя изменять классы Robot и Battery.
 * •	Массив batteryWarehouse должен содержать сто тысяч пятьсот батареек.
 * •	Метод distributeBatteries должен раздать батарейки з массива batteryWarehouse роботам из массива robots, чтобы среди них не осталось робозомби.
 */
public class Task217Answer {
    public static Battery[] batteryWarehouse = Battery.getBatteries();

    public static void main(String[] args) {
        Robot[] robots = new Robot[]{new Robot(), new Robot(), new Robot(), new Robot(), new Robot(), new Robot(), new Robot()};
        System.out.println(Arrays.toString(robots));

        distributeBatteries(robots);

        System.out.println(Arrays.toString(robots));
    }

    public static void distributeBatteries(Robot[] robots) {
        int batteryCounter = 0;
        for (Robot robot : robots) {
            robot.replaceBattery(batteryWarehouse[batteryCounter++]);
            while (robot.getCharge() < 20) {
                robot.replaceBattery(batteryWarehouse[batteryCounter++]);
            }
        }
    }}
