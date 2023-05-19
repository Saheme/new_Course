package edu.javaCourse.lesson_20_ArrayList.classWork.methodsArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Methods6 {
    public static void main(String[] args) {
        String s = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList<String> list = new ArrayList<>();
        list.add(s3);
        list.add(s);
        list.add(s4);
        list.add(s2);
        System.out.println(list);
        System.out.println("------------------------");

        //16 Collections.sort(ArrayList <DataType>)-> void, сортирует массив
        Collections.sort(list);
        System.out.println(list);
        System.out.println("-----Collections----------");

        //17 equals(ArrayList<DataType>)-> , сравнивает объекты ArrayList
        ArrayList<String> list2 = list;
        System.out.println(list2.equals(list));
        ArrayList<String> list3 = new ArrayList<>();
        list3.add(s3);
        list3.add(s);
        list3.add(s4);
        list3.add(s2);
        System.out.println(list3);
        System.out.println(list3.equals(list));
    }
}
