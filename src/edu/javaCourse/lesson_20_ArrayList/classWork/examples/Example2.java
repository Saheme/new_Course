package edu.javaCourse.lesson_20_ArrayList.classWork.examples;

import java.util.ArrayList;

public class Example2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        for (String line : list) {
            System.out.println("Number = " + line +  " " + line.length());
        }

        System.out.println("\n-----------------------");
    }
}
