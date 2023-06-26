package edu.javaRushCourse.JavaSyntax.level14.lesson1;

import java.util.HashSet;
import java.util.Set;

/**
 * Логи Инстаматрицы добавляются в список matrixLogs через метод fillMatrixLog(). Галабаги добавили в этом методе свой код,
 * через который в список matrixLogs добавляется какое-то количество файлов-багов.
 * <p>
 * Твоя задача — определить количество этих файлов в списке matrixLogs, используя режим отладки.
 * <p>
 * Для этого требуется:
 * <p>
 * Поставить break point напротив вызова метода println и запустить программу в режиме отладки.
 * <p>
 * После первой остановки в режиме отладки нажать Alt+F8 (Option+F8 для macOS) и выполнить (Evaluate) следующий код:
 * <p>
 * <p>
 * matrixLogs.stream().filter(s -> s.startsWith("buahaha")).count()
 * В итоге в классе Solution должно быть только одно изменение: поле numberOfBugs должно быть инициализировано значением, полученным при дебаге.
 * <p>
 * Требования:
 * •	Не изменяй методы main() и fillMatrixLog(), а также строку где создана переменная matrixLogs.
 * •	Полю numberOfBugs должно быть присвоено правильное значение.
 */
public class Task301 {
    public static Set<String> matrixLogs = new HashSet<>();

    public static int numberOfBugs = 58;

    public static void main(String[] args) {
        fillMatrixLog();

        for (String log : matrixLogs) {
            System.out.println(log);
        }
    }

    public static void fillMatrixLog() {
        for (int i = 0; i < 400; i++) {
            matrixLogs.add("interestingLog" + i + ".log");
            if ((i > 0) && (i % 5 == 0) && (i < 295)) {
                matrixLogs.add("buahaha" + i + ".bug");
            }
        }
    }
}
