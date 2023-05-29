package edu.javaRushCourse.JavaSyntax.level6.lesson4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * В этой задаче тебе нужно:
 * <p>
 * Считать 6 строк и заполнить ими массив strings.
 * Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
 * Примеры.
 * <p>
 * Массив после чтения строк:
 * {"Hello", "Hello", "World", "Java", "Tasks", "World"}
 * Массив после удаления повторяющихся строк:
 * {null, null, null, "Java", "Tasks", null}
 * <p>
 * Требования:
 * •	В методе main(String[]) считай с клавиатуры 6 строк и заполнить ими массив strings.
 * •	В методе main(String[]) удали(заменить строку на null) элементы из массива strings с одинаковыми строками.
 */
public class Task96 {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scan.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            String current = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (current == null) {
                    break;
                }
                if ( current.equals(strings[j])) {
                     strings[i] = null;
                     strings[j] =null;
                }
                }
            }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }

    }
}

