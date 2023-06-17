package edu.javaRushCourse.JavaSyntax.level13.lesson3;

import java.util.ArrayList;

public class dop {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i,i);

        }
        System.out.println(list);
    }
}
