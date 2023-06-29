package edu.javaRushCourse.JavaSyntax.level14.lesson6.task319;

/**
 * В enum JavarushQuest хранится список квестов. Твоя задача — получить массив всех элементов
 * в методе main (используй метод values()) и вывести порядковый номер каждого из них (используй метод ordinal()) с новой строки.
 *
 * Требования:
 * •	В методе main получи список всех констант из enum JavarushQuest с помощью метода values().
 * •	В методе main выведи порядковый номер каждого элемента с новой строки, используя метод ordinal().
 */
public class Solution {
    public static void main(String[] args) {
        JavarushQuest[]array =JavarushQuest.values();
        for (JavarushQuest quest : array) {
            System.out.println(quest.ordinal());
        }

    }
}
