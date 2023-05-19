package edu.javaCourse.lesson_20_ArrayList.classWork.methodsArrayList;

import java.util.ArrayList;

public class Methods9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println("list : " + list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("one");
        list2.add("three");
        list2.add("four");
       //list2.add("ten");

        System.out.println("list2 : " + list2);

        System.out.println("\n-----------------------");

        //21. containsAll(Collection <> c) -> boolean, boolean, содержит ли первый  ArrayLIst, все эллементы второго ArrayLIst , тогда возвращает true, иначе false
        boolean result = list.containsAll(list2);
        System.out.println(result);



    }
}
