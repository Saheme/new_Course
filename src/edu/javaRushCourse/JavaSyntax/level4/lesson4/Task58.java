package edu.javaRushCourse.JavaSyntax.level4.lesson4;

import java.util.Scanner;

/**
 * Галабаги боятся загадочного целого числа. Нужно его найти в методе checkNumber(int).
 * В этом методе в бесконечном цикле считываются целые числа с клавиатуры. Каждое считанное число сравнивается с входящим параметром.
 * Если они одинаковые, то бесконечный цикл прерывается — загадочное число найдено и оно выводится в консоль.
 *
 * Вывод должен быть следующим:
 * "Загадочное число равно <число>".
 *
 * Если числа разные — выводим в консоль фразу "Попробуй еще раз" и продолжаем поиск.
 *
 * Для прерывания цикла используй оператор break.
 * Метод main() не участвует в тестировании.
 *
 * Требования:
 * •	В методе checkNumber(int) необходимо вывести в консоль искомое число согласно условию.
 * •	В программе необходимо использовать цикл while.
 * •	В программе необходимо использовать оператор break.
 */
public class Task58 {
    public static void main(String[] args) {
        System.out.println("Введите предполагаемое число");

        checkNumber(5);
    }

    public static void checkNumber(int number) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        while (true){
            inputNumber = scanner.nextInt();
            if (number==inputNumber){
                break;
            }else {
                System.out.println("Попробуй еще раз");
            }
        }
            System.out.println("Загадочное число равно "+inputNumber);
    }
}
