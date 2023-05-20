package edu.javaRushCourse.JavaSyntax.level2.lesson4;

/**
 * Используя только оператор декремента, измени значение переменной toothCounter, чтобы на экран вывелось число 23.
 * Требования:
 * •	Не изменяй команду объявления переменной toothCounter.
 * •	К переменной toothCounter нужно применить несколько команд декремента, чтобы она изменила значение на 23.
 * •	Программа должна выводить на экран переменную toothCounter со значением 23.
 */
public class Task17 {
    public static void main(String[] args) {
        int toothCounter = 32;

        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;


        System.out.println(toothCounter);
    }
}
