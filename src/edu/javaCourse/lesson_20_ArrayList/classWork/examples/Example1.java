package edu.javaCourse.lesson_20_ArrayList.classWork.examples;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello!");
        StringBuilder sb2 = new StringBuilder("GoodBye!");
        StringBuilder sb3 = new StringBuilder("I wish !");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        for (int i = 0; i < list.size(); i++) {
            list.get(i).append("!!!");
        }
        for (StringBuilder sb : list) {

            System.out.print(list + " ");
        }
    }
}
