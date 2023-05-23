package edu.javaRushCourse.JavaSyntax.level3.lesson7;

/**
 * Нужно исправить потёртый багами код, по которому работают устройства цеха готовки, выращивания и обработки еды.
 * Чтобы еда не испортилась во время готовки, жарку нужно вовремя остановить.
 * Если пережариваем, то мясо сгорает. Если все ок, то получаем ароматный бифштекс.
 *
 * Тебе нужно исправить ошибки компиляции.
 *
 * Требования:
 * •	Исправь строку с объявлением переменных, используя запятые.
 * •	Исправь выражение тернарного оператора расположив знаки тернарного оператора в правильном порядке.
 */
public class Task44 {
    public static void main(String[] args) {
        int temperatureLow, temperatureMiddle, temperatureHigh, time;
        temperatureLow = 100;
        temperatureMiddle = 400;
        temperatureHigh = 1000;
        time = 50;
        String result = time > 40 ? "Мясо сгорело" : time < 35 ? "Мясо готовится" : "Мясо готово";

        System.out.println(result);
    }
}
