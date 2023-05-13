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

        //7. indexOf(Object element)-> int, по значению первый элемента возвращает индекс в котором храниться элемент
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
