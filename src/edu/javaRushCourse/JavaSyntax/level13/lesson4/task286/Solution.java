package edu.javaRushCourse.JavaSyntax.level13.lesson4.task286;

import java.util.Arrays;

/**
 * Диего и Амиго потеряли контроль над своими роботелами из-за Мегабага, который в данный момент контролирует их процессоры с помощью багнутых списков.
 * Каждый список — это процессор робота, а каждый элемент списка является ядром процессора.
 * Все ядра были изначально пронумерованы числами от 0 до 9 (включительно),
 * но Мегабаг в случайном порядке заменил некоторые элементы списков amigoRobot и diegoRobot на null.
 *
 * Твоя задача — пройтись по спискам и заменить каждое значение null на соответствующий номер ядра, затем вывести результат на экран.
 *
 * Для этого требуется:
 *
 * В классе Solution создать public static метод fixRobot(), который принимает параметр типа Robot.
 * Этот метод должен в переданном ему через переменную robot списке заменять только элементы null на объекты Core,
 * с номером, который соответствует номеру ядра.
 * В классе Solution создать public static метод printRobot(), который принимает параметр типа Robot.
 * Этот метод должен печатать все элементы списка, переданного ему через переменную robot.
 * В методе main() два раза вызвать метод fixRobot() и передать ему списки amigoRobot и diegoRobot.
 * В методе main() два раза вызвать метод printRobot() и передать ему списки amigoRobot и diegoRobot.
 * Требования:
 * •	Нельзя изменять классы Robot и Core, а также списки amigoRobot/diegoRobot в методе main() класса Solution.
 * •	В классе Solution должен быть создан public static метод fixRobot() согласно требованиям.
 * •	В классе Solution должен быть создан public static метод printRobot() согласно требованиям.
 * •	В методе main() должен быть два раза вызван метод fixRobot() согласно требованиям.
 * •	В методе main() должен быть два раза вызван метод printRobot() согласно требованиям.
 */


public class Solution {

    public static void main(String[] args) {
        Robot amigoRobot = new Robot(Arrays.asList(null, new Core(1), new Core(2), null,
                new Core(4), new Core(5), null, new Core(7), null, new Core(9)));
        Robot diegoRobot = new Robot(Arrays.asList(new Core(0), null, null, new Core(3), null,
                new Core(5), new Core(6), new Core(7), null, null));

        fixRobot(amigoRobot);
        fixRobot(diegoRobot);
        printRobot(amigoRobot);
        printRobot(diegoRobot);
    }

    public static void fixRobot(Robot robot) {
        for (int i = 0; i < robot.getCores().size(); i++) {
            if (robot.getCores().get(i) == null) {
                robot.getCores().set(i, new Core(i));
            }
        }

    }

    public static void printRobot(Robot robot) {
        for (Core text : robot.getCores()) {
            System.out.println(text);
        }
    }}