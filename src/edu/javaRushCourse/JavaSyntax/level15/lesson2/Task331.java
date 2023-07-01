package edu.javaRushCourse.JavaSyntax.level15.lesson2;

/**
 * Требуется пройти цепочку тестов, положительным итогом которых будет вывод на экран строки "All tests pass. You may go" (кроме выводов результатов работы методов).
 *
 * Для этого требуется:
 *
 * В методе startTest изменить строку с выводом на экран так, чтобы после запуска программы не выпадала ошибка ArithmeticException.
 * В методе question2 изменить строку с выводом на экран так, чтобы после запуска программы не выпадала ошибка NullPointerException.
 * В методе question3 изменить строку с выводом на экран так, чтобы после запуска программы не выпадала ошибка ArrayIndexOutOfBoundsException.
 * В методе question4 изменить строку с Integer.parseInt() так, чтобы после запуска программы не выпадала ошибка NumberFormatException.
 * Пример вывода на экран:
 *
 * 1
 * 1
 * t
 * All tests passed. You may go.
 * Требования:
 * •	В методе main необходимо вызывать метод startTest.
 * •	В результате работы метода startTest не должно появляться ошибки ArithmeticException.
 * •	В результате работы метода question2 не должно появляться ошибки NullPointerException.
 * •	В результате работы метода question3 не должно появляться ошибки ArrayIndexOutOfBoundsException.
 * •	В результате работы метода question4 не должно появляться ошибки NumberFormatException. Также на экран должна быть выведена строка "All tests passed. You may go.".
 */
public class Task331 {
    public static void main(String[] args) {
        startTest();
    }

    public static void startTest() {
        try {
            System.out.println(1);
            question2();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void question2() {
        try {
            System.out.println(1);
            question3();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static void question3() {
        char[] array = {'T', 'e', 's', 't',};
        try {
            System.out.println(array[3]);
            question4();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static void question4() {
        try {
            int num = Integer.parseInt("1");
            System.out.println("All tests passed. You may go.");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
