package edu.javaCourse.lesson_20_ArrayList.classWork.methodsArrayList;

import java.util.ArrayList;

public class Methods2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello!");
        list.add("Goodbye!");
        list.add("monster");
        list.add(1, "month");

        //5. addAll(ArrayList aL)-> boolean, добавляет в конец одного ArrayList другой ArrayList, типы данных должны совпадать
        //  addAll(int index, ArrayList aL)-> boolean, index указывает в какой индекс начнет добавляться второй ArrayList
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Monday");
        list2.add("Tuesday");
        list2.add("Wednesday");

        for (String s : list) {
            System.out.print( s + " ");
        }

        System.out.println("\n------------------");
        list.addAll(1,list2);

        for (String s : list) {
            System.out.print( s + " ");
        }
        System.out.println("\n------------------");
        list2.set(1,"Roar");

        for (String s : list) {
            System.out.print( s + " ");
        }
        System.out.println("\n------------------");
       //6 clear(), очищает лист
        list2.clear();
        for (String s : list2) {
            System.out.print( s + " ");
        }
    }
}

