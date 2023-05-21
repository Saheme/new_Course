package edu.javaRushCourse.JavaSyntax.level2.lesson7;

/**
 *В переменную result нужно записать строку "100500".
 * Используй переменные numberOne, numberTwo, numberThree, string.
 *
 * Вывод должен быть следующий:
 * Разгоняем Амиго на 100500%
 *
 * Требования:
 * •	Не изменяй значения переменных numberOne, numberTwo, numberThree, string.
 * •	Для инициализации переменной result используй numberOne, numberTwo, numberThree, string.
 * •	Вызов метода отвечающего за вывод не менять.
 * •	Вывод должен быть согласно условию.
 */
public class Task28 {
    public static void main(String[] args) {
        int numberOne = 3;
        int numberTwo = 1;
        int numberThree = 1;
        String string = "00";

        String result = numberTwo+string+(numberOne+numberTwo+numberThree)+string;
                System.out.println("Разгоняем Амиго на " + result + "%");
    }
}
