package edu.javaRushCourse.JavaSyntax.level10.lesson6;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Используя StringTokenizer раздели query на части по разделителю delimiter.
 *
 * Пример:
 * getTokens("java.util.stream", "\\.")
 * возвращает массив строк
 * {"java", "util", "stream"}
 *
 * Hint: решить задачу поможет метод countTokens().
 *
 * Требования:
 * •	Нужно, чтобы метод getTokens(String, String) использовал StringTokenizer.
 * •	Нужно, чтобы метод getTokens(String, String) возвращал массив типа String, заполненный согласно условию задачи.
 */
public class Task211 {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer =new StringTokenizer(query,delimiter);
        String[]str = new String[tokenizer.countTokens()];
        for (int i = 0; i < str.length; i++) {
            str[i] = tokenizer.nextToken();
        }
        return str;
    }
}


