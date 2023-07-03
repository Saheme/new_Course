package edu.javaRushCourse.JavaSyntax.level15.lesson5;

import java.util.ArrayList;
import java.util.List;

/**
 * В классе Solution есть методы составляющие ДНК: adenine(), thymine(), cytosine(), guanine(). Их стектрейсы собраны в список в методе DNA.
 *
 * Твоя задача — в методе printDNA() создать вывод стектрейсов четырех методов составляющих ДНК,
 * но без вывода информации по методу getStackTrace класса Thread.
 *
 * В итоге в консоль должно быть выведено 4 строки в следующем формате:
 *
 * "File name: Solution.java, Method name: adenine, Line number: 32"
 * Требования:
 * •	Не изменяй методы main(), getDNA(), adenine(), thymine(), cytosine() и guanine().
 * •	Метод printDNA() должен выводить в консоль четыре строки согласно условиям.
 */
public class Task345Answer {
    public static void main(String[] args) {
        printDNA();
    }

    public static void printDNA() {
        for (StackTraceElement[] stackTraceElements : getDNA()) {
            StackTraceElement traceElement = stackTraceElements[1];
            System.out.printf("File name: %s, Method name: %s, Line number: %d\n",
                    traceElement.getFileName(), traceElement.getMethodName(), traceElement.getLineNumber());
        }
    }

    private static List<StackTraceElement[]> getDNA() {
        List<StackTraceElement[]> list = new ArrayList<>();

        list.add(adenine());
        list.add(thymine());
        list.add(cytosine());
        list.add(guanine());

        return list;
    }

    private static StackTraceElement[] adenine() {
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] thymine() {
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] cytosine() {
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] guanine() {
        return Thread.currentThread().getStackTrace();
    }
}
