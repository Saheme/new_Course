package edu.javaRushCourse.JavaSyntax.level13.lesson2.Task280;

import java.util.Arrays;

/**
 * Нужно подключиться к системе управления орбитальным городом, чтобы выяснить, что происходит на станции.
 *
 * Для подключения реализуй метод getConnection в классе Solution. Метод принимает в качестве параметра планету,
 * у планеты есть орбитальные станции, у каждой станции есть система управления, а у каждой системы управления — множество фальшивых интерфейсов.
 *
 * Твоя задача — перебрать все интерфейсы и найти среди них настоящий. Для этого используй два метода системы управления:
 *
 * getInterfacesNumber возвращает общее количество интерфейсов
 * connect принимает на вход индекс интерфейса и возвращает объект типа Boolean
 * У настоящего интерфейса метод connect возвращает объект Boolean.TRUE, у фальшивых интерфейсов — другие объекты или null.
 *
 * Метод getConnection должен вернуть массив int[] из двух элементов:
 *
 * первый — индекс орбитальной станции, система управления которой содержит настоящий интерфейс
 * второй — индекс настоящего интерфейса
 * Если настоящий интерфейс отсутствует, getConnection должен вернуть null.
 * Если существует несколько настоящих интерфейсов, getConnection должен вернуть координаты любого из них.
 *
 * Требования:
 * •	Нельзя изменять класс Planet и его внутренние классы.
 * •	Метод getConnection должен вернуть координаты настоящего интерфейса.
 * •	Метод getConnection должен вернуть null, если настоящий интерфейс не найден.
 */
public class Solution {
    public final static Planet LULG;

    static {
        LULG = new Planet("Лулг");
        LULG.stations = new Planet.OrbitalStation[]{new Planet.OrbitalStation("Большое Орбитальное Кольцо")};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConnection(LULG)));
    }

    public static int[] getConnection(Planet planet) {
        int[]getConnection = new int[2];
        for (int i = 0; i < planet.stations.length; i++) {
            for (int j = 0; j < planet.stations[i].controlSystem.getInterfacesNumber(); j++) {
                if (planet.stations[i].controlSystem.connect(j) == Boolean.TRUE) {
                    getConnection[0] = i;
                    getConnection[1] = j;
                    return getConnection;
                }
            }
        }
        return null;
    }
}

//    Может кому поможет в порохождении:
//        1. Необходимо пройтись циклом массив
//        planet.stations
//
//        2. Внутри цикла создать ещё 1 цикл
//        planet.stations[<ИндексПервогоМассива>].controlSystem.getInterfacesNumber()
//
//        3. И тут уже проверять
//        connect(<ИндексВторогоМассива)>
//        на равенство с
//        Boolean.TRUE