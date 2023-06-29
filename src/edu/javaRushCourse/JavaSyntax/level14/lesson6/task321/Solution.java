package edu.javaRushCourse.JavaSyntax.level14.lesson6.task321;

/**
 * В классе Solution реализуй метод getNextMonth, который должен возвращать следующий месяц, а если передан последний месяц,
 * возвращать первый. Используй методы values и ordinal.
 * Метод main не участвует в проверке.
 *
 * Требования:
 * •	Реализуй метод public static Month getNextMonth(Month): он должен работать согласно условию.
 * •	В методе getNextMonth должны использоваться методы ordinal() и values().
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.DECEMBER));
    }

    public static Month getNextMonth(Month month) {
        int index = month.ordinal();
        if (month.ordinal()==11){
            return Month.values()[0];
        }else {
            return  Month.values()[index + 1];
        }
    }
}
