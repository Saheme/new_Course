package edu.javaRushCourse.JavaSyntax.level2.lesson4;

/**
 * Используя только оператор инкремента, измени значение в переменной six, чтобы на экран вывелась цифра 9.
 * Требования:
 * •	Не изменяй команду объявления переменной six.
 * •	К переменной six нужно применить несколько команд инкремента, чтобы она изменила значение на 9.
 * •	Программа должна выводить на экран переменную six со значением 9.
 */
public class Task16 {
    public static void main(String[] args) {
        int six = 6;

        six++;
        six++;
        six++;


        System.out.println(six);
    }
}
