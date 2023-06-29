package edu.javaRushCourse.JavaSyntax.level14.lesson2;

import java.util.HashSet;
import java.util.Set;

/**
 * Используя цикл for-each, нужно очистить систему Инстаматрицы от вирусов.
 *
 * Для этого требуется:
 *
 * В классе Solution создать публичный статический метод removeBugs, который ничего не принимает и не возвращает.
 * Метод removeBugs должен удалить все элементы списка matrixLogs, название которых начинается на "buahaha", используя цикл for-each и не используя итератор.
 * В методе main нужно один раз вызвать метод removeBugs.
 * Требования:
 * •	В классе Solution требуется создать публичный статический метод removeBugs.
 * •	Метод removeBugs должен удалять все баги из списка matrixLogs, используя цикл for-each и не используя итератор.
 * •	Метод main должен один раз вызвать метод removeBugs.
 */
public class Task305 {
    public static Set<String> matrixLogs = new HashSet<>();

    public static void main(String[] args) {
        fillMatrixLog();
        removeBugs();
    }
    public static void removeBugs(){
        Set <String> matrixLogsCopy = new HashSet<>(matrixLogs);
        for (String str : matrixLogsCopy) {
            if (str.contains("buahaha")){
                matrixLogs.remove(str);
            }
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
