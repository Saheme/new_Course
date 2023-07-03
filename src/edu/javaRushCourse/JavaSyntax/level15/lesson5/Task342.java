package edu.javaRushCourse.JavaSyntax.level15.lesson5;

/**
 * Метод printStackTrace принимает в качестве параметра массив stackTrace. Нужно вывести информацию о каждом элементе массива в формате:
 * "Метод <имя метода> вызван из строки <номер строки> класса <имя класса> в файле <имя файла>."
 * Информацию о каждом элементе выводи с новой строки.
 *
 * Пример:
 * Метод addJuice вызван из строки 24 класса com.javarush.task.pro.task14.task1414.Solution в файле Solution.java.
 *
 * Требования:
 * •	Метод printStackTrace должен выводить информацию о каждом элементе массива stackTrace.
 */
public class Task342 {
    public static final String OUTPUT_FORMAT = "Метод %s вызван из строки %d класса %s в файле %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        for (StackTraceElement info : stackTrace) {
            System.out.printf(OUTPUT_FORMAT,info.getMethodName(),info.getLineNumber(),info.getClassName(),info.getFileName());
        }
    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
