package edu.professionalJava.part2_ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Alex");
        list.add("Matataipa");
        list.add("Gorge");
        System.out.println("Перед сортировкой");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("После сортировки ");
        System.out.println(list);
    }
}
