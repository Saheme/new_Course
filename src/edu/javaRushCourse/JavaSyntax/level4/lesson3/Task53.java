package edu.javaRushCourse.JavaSyntax.level4.lesson3;

/**
 * Используя цикл while вывести на экран сто раз цитату (переменная quote):
 * «Я никогда не буду работать за копейки. Амиго»
 * <p>
 * Каждое значение вывести с новой строки.
 * <p>
 * Требования:
 * •	Программа должна выводить текст на экран.
 * •	Программа должна выводить на экран 100 раз содержимое переменной quote.
 * •	В программе необходимо использовать цикл while.
 */
public class Task53 {
    public static void main(String[] args) {
        String quote = "Я никогда не буду работать за копейки. Амиго";
        int count = 0;
        while (count < 100) {
            System.out.println(quote);
            count++;
        }

    }
}
