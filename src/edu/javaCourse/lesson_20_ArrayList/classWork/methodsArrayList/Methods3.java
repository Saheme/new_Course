package edu.javaCourse.lesson_20_ArrayList.classWork.methodsArrayList;

import java.util.ArrayList;

public class Methods3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("monster");
        list.add("Hello!");
        list.add("Goodbye!");
        list.add(1, "month");
        list.add("monster");

        System.out.println("\n-------7 метод-------");

        //7. indexOf(Object element)-> int, по значению первый элемента возвращает индекс в котором храниться элемент
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("B");
        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add(sb1);
        list2.add(sb2);
        list2.add(sb3);
        list2.add(sb4);
        for (StringBuilder str: list2) {
            System.out.print(str + " ");
        }
        System.out.println();
        System.out.println(list2.indexOf(new StringBuilder("B")));
        System.out.println(list2.indexOf("B"));

        System.out.println(list.indexOf("monster"));
        System.out.println(list.lastIndexOf("monster"));

        System.out.println("\n-------8 метод-------");
        //8.
        System.out.println(list.indexOf("monster"));
        System.out.println(list.lastIndexOf("monster"));
        //9 size() -> int , возвращает размер
        System.out.println(list.size());

        // 10. isEmpty()-> boolean, проверяет пустой ли ArrayList, если не пустой возвращает false
        System.out.println(list.isEmpty());
        System.out.println("---------------------");

        //11 contains(Object element) -> boolean, проверяет, есть ли такой объект в  ArrayList
        System.out.println(list.contains("monster"));
        //12 toString() -> String, выводит в кансоль ArrayList
        System.out.println(list.toString());
    }
}
