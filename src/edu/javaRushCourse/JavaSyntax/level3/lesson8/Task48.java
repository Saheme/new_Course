package edu.javaRushCourse.JavaSyntax.level3.lesson8;

/**
 * Робокондитер делает все неправильно, подписывает ингредиенты верхним регистром, но потом не может распознать надписи.
 * Нужно исправить код, чтобы робокондитер не менял регистр букв в названиях ингредиентов.
 *
 * Для этого исправь объявление переменных ingredient1, ingredient2, ingredient3.
 *
 * Требования:
 * •	Исправь объявление переменной ingredient1.
 * •	Исправь объявление переменной ingredient2.
 * •	Исправь объявление переменной ingredient3.
 */
public class Task48 {
    static String sugar = "Сахар";
    static String milk = "Молоко";
    static String flour = "Мука";

    public static void main(String[] args) {
        String ingredient1 = sugar;
        String ingredient2 = milk;
        String ingredient3 = flour;

        if (ingredient1 == sugar || ingredient2 == sugar || ingredient3 == sugar) {
            System.out.println("Кладем сахар в миску");
        }
        if (ingredient1 == milk || ingredient2 == milk || ingredient3 == milk) {
            System.out.println("Кладем молоко в миску");
        }
        if (ingredient1 == flour || ingredient2 == flour || ingredient3 == flour) {
            System.out.println("Кладем муку в миску");
        }
    }
}
