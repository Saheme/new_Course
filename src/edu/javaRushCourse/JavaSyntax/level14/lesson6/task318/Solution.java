package edu.javaRushCourse.JavaSyntax.level14.lesson6.task318;

/**
 * Нужно создать набор значений (enum) для времен года. Для этого нужно в отдельном файле создать enum Season и объявить в нем 4 значения.
 * В методе Solution выведи все перечисления с новой строки.
 *
 * Требования:
 * •	В отдельном файле создай публичный enum Season и добавь значения: WINTER, SPRING, SUMMER, AUTUMN.
 * •	В классе Solution выведи в консоли каждый сезон с новой строки. Используй перечисления напрямую: например, Season.WINTER.
 */
public class Solution {

    public static void main(String[] args) {
        Season summer = Season.SUMMER;
        Season spring = Season.SPRING;
        Season winter = Season.WINTER;
        Season autumn = Season.AUTUMN;
        System.out.printf("%s\n%s\n%s\n%s\n",winter,spring,summer,autumn);

    }
}
