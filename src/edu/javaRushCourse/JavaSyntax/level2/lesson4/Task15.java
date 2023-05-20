package edu.javaRushCourse.JavaSyntax.level2.lesson4;

/**
 * В переменной number записано число.
 * В переменную lastDigit нужно записать последнюю цифру этого числа.
 * Для вычисления используй переменную number и оператор «остаток от деления».
 * Для объявления и инициализации lastDigit используй одну команду.
 * <p>
 * Подсказка: делить нужно на 10.
 * <p>
 * Требования:
 * •	Не изменяй значение переменной number.
 * •	Для вычисления lastDigit должны использоваться number и оператор «остаток от деления».
 * •	Программа должна выводить на экран значение переменной lastDigit.
 */
public class Task15 {
    public static void main(String[] args) {
        int number = 546;

        int lastDigit = number % 10; //напишите тут ваш код

        System.out.println(lastDigit);
    }
}
