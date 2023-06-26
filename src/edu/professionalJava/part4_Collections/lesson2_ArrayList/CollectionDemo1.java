package edu.professionalJava.part4_Collections.lesson2_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo1 {
    public static void main(String[] args) {
        // Создание
        //1. Способ
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Alex");
        arrayList1.add("Valy");
        arrayList1.add("Jonn");
        System.out.println(arrayList1);
        //2.Способ с указанием capacity.200 - заданное сразу capacity
         ArrayList<Integer> arrayList2 = new ArrayList<>(200);

         //3.способ, ч/з интерфейс list
        List<Double>list3 = new ArrayList<>();

        //4 Способ. Создание с помощью другого Arraylist
        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println("4 способ : " + arrayList4);
    }
}
