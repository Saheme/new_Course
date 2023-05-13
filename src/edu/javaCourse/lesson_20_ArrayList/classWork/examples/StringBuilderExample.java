package edu.javaCourse.lesson_20_ArrayList.classWork.examples;

import java.util.ArrayList;

public class StringBuilderExample {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("Hello!"));
        list.add(new StringBuilder("Goodbye!"));
        list.add(new StringBuilder("monster"));
        list.add(new StringBuilder("month") );


        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("Monday"));
        list2.add(new StringBuilder("Tuesday"));
        list2.add(new StringBuilder("Wednesday"));

        list.addAll(3,list2);
        for (StringBuilder st: list) {
            System.out.print(st + " ");
        }
        System.out.println("\n------------------------");
        list2.set(1,new StringBuilder("!!ROAR!!"));

        list.addAll(3,list2);
        for (StringBuilder st: list) {
            System.out.print(st + " ");
        }
    }
}
