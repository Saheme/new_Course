package edu.javaRushCourse.JavaSyntax.level10.lesson2.Task201;

import java.util.Arrays;

/**
 * ИИ корабля просканировал код роботов-пиратов, и оказалось, что это очень примитивный код.
 *
 * Нужно реализовать метод replaceTarget, который получает на вход массив погрузчиков кондитерских изделий.
 * Метод должен найти у них в памяти наш корабль ("Nimrod"), и подставить вместо него корабль пиратов ("pirate ship").
 *
 * Название нашего корабля может находится в в разных местах строки и иметь разный регистр букв.
 *
 * Требования:
 * •	Реализуй метод replaceTarget согласно условию.
 */
public class Task201 {
    public static void main(String[] args) {
        PastryLoader[] pastryLoaders = new PastryLoader[]{new PastryLoader(), new PastryLoader(), new PastryLoader()};

        scanMemory(pastryLoaders);
        replaceTarget(pastryLoaders);
       // scanMemory(pastryLoaders);
    }

    public static void scanMemory(PastryLoader[] pastryLoaders) {
        System.out.println();
        for (PastryLoader pastryLoader : pastryLoaders) {
            System.out.println(Arrays.deepToString(pastryLoader.memory));
        }
    }

    public static void replaceTarget(PastryLoader[] pastryLoaders) {
        for (int i = 0; i < pastryLoaders.length; i++) {
           if (pastryLoaders[i].equals("Nimrod")){

           }
        }

    }
}
