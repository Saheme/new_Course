package edu.javaRushCourse.JavaSyntax.level15.lesson4;

/**
 * Объедини блоки catch с одинаковым кодом.
 *
 * Требования:
 * •	Количество блоков catch должно быть минимальным.
 */
public class Task139 {
    public static void main(String[] args) {
        try {
            System.out.println("Программа работает от забора");
            Thread.sleep(1000);
            System.out.println("до обеда");
        } catch (NullPointerException|NumberFormatException e) {
            System.out.println("Произошло исключение на букву N");
            System.out.println("Произошло исключение на букву N");
        } catch (IllegalArgumentException |IllegalStateException|InterruptedException e) {
            System.out.println("Произошло исключение на букву I");
            System.out.println("Произошло исключение на букву I");
        } catch (ClassCastException e) {
            System.out.println("Произошло исключение на букву C");
            System.out.println("Произошло исключение на букву I");
        }
    }
}
