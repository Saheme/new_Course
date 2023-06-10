package edu.javaRushCourse.JavaSyntax.level10.lesson6;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * В блоки управления пиратов (массив controlUnits) проникли вирусы и баги. Требуется почистить эти блоки, чтобы помочь пиратам.
 * <p>
 * С этой задачей нам помогут два метода в классе Solution: splitArrayElements и getStringFromArray.
 * В методе splitArrayElements требуется пройтись по массиву controlUnits и с помощью StringTokenizer разбить элементы таким образом,
 * чтобы массив изменился на пять следующих строк: "one", "two", "three", "four" и "five".
 * <p>
 * Затем в методе getStringFromArray требуется пройтись по массиву controlUnits и с помощью String.format() отформатировать
 * каждый его элемент таким образом, чтобы элементы массива изменились на следующие:
 * <p>
 * "Block one back online."
 * <p>
 * "Block two back online."
 * <p>
 * "Block three back online."
 * <p>
 * "Block four back online."
 * <p>
 * "Block five back online."
 * Метод main не участвует в проверке.
 * <p>
 * Требования:
 * •	Не изменяй изначальные значения массива controlUnits в классе Solution.
 * •	Метод splitArrayElements должен изменять элементы массива controlUnits согласно условиям.
 * •	Метод getStringFromArray должен изменять элементы массива controlUnits согласно условиям.
 */
public class Task214 {
    public static String[] controlUnits = {"iAm/A/spyware/one", "iAm/A/malware/two", "iAm/A/virus/three", "iAm/A/trojan/four", "iAm/bug/five"};

    public static void main(String[] args) {
        splitArrayElements();
        getStringFromArray();
        printArray(controlUnits);
    }

    public static void splitArrayElements() {
        for (int i = 0; i < controlUnits.length; i++) {
            StringTokenizer tokenizer = new StringTokenizer(controlUnits[i], "/");
            while (tokenizer.hasMoreElements()) {
                controlUnits[i] = tokenizer.nextToken();
            }
        }
    }


    public static void getStringFromArray() {
        for (int i = 0; i < controlUnits.length; i++) {
            controlUnits[i] = String.format("Block %s back online.", controlUnits[i]);
        }
    }

    public static void printArray(String[] array) {
        for (String s : array) {
            System.out.println(s);
        }
    }
}
