package edu.javaRushCourse.JavaSyntax.level2.lesson6;

/**
 * В переменную hugeAmount нужно записать число 100500.
 * Используй переменные bigAmount, greatAmount и преобразование строки в число.
 * Для объявления и инициализации hugeAmount используй одну команду.
 *
 * Требования:
 * •	Не изменяй значения переменных bigAmount и greatAmount.
 * •	Для инициализации переменной hugeAmount используй bigAmount, greatAmount и метод Integer.parseInt(String).
 * •	Программа должна выводить на экран переменную hugeAmount.
 */
public class Task24 {
    public static void main(String[] args) {
        String bigAmount = "500";
        String greatAmount = "100000";

        int hugeAmount = Integer.parseInt(greatAmount)+Integer.parseInt(bigAmount); //напишите тут ваш код

        System.out.println(hugeAmount);
    }
}
