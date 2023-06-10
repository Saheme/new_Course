package edu.javaRushCourse.JavaSyntax.level10.lesson4.Task206;

import static edu.javaRushCourse.JavaSyntax.level10.lesson4.Task206.CaptainBridge.checkAccess;
import static edu.javaRushCourse.JavaSyntax.level10.lesson4.Task206.CaptainBridge.debugAccess;

/**
 * Нужно получить ранг доступа на мостик, чтобы подобраться к капитану.
 * Сканирование показало семь возможных рангов: Раб, Гость, Боец, Ветеран, Картографист, Капитан, Стив.
 *
 * Система безопасности дает доступ только одному из этих рангов случайным образом. А чтобы получить доступ (метод checkAccess),
 * есть всего одна попытка, иначе поднимется тревога.
 * Так как робопираты — те еще говнокодеры, тебе не составит труда найти уязвимость в их системе безопасности.
 *
 * Требования:
 * •	Нельзя изменять класс CaptainBridge.
 * •	Метод main должен ровно один раз вызвать метод checkAccess.
 * •	Метод main должен передать в метод checkAccess правильный ранг (чтобы получить доступ на мостик).
 */
public class Task206 {
    public static void main(String[] args) {


        String[] array = {"Раб", "Гость", "Боец", "Ветеран", "Картографист", "Капитан", "Стив"};
        for (int i = 0; i < array.length; i++) {
            if (CaptainBridge.debugAccess(array[i])) {
                checkAccess(array[i]);
                break;
            }

        }
    }
}
