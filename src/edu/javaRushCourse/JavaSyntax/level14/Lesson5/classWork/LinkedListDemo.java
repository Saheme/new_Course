package edu.javaRushCourse.JavaSyntax.level14.Lesson5.classWork;
/**
 * Сравниваем скорость работы ArrayList и LinkedList
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        measureTime(arrayList);
        measureTime(linkedList);
        System.out.println("-------------");
        measureTimeInStart(arrayList);
        measureTimeInStart(linkedList);
    }

    public static void measureTime(List <Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

    public static void measureTimeInStart(List <Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            list.add(0,i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}
