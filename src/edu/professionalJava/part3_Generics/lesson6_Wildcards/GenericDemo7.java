package edu.professionalJava.part3_Generics.lesson6_Wildcards;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo7 {
    public static void main(String[] args) {
        List<?> list =new ArrayList<Integer>();
        List<Double> list1 = new ArrayList<>();
        list1.add(5.8);
        list1.add(7.4);
        list1.add(3.14);

        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("One");
        list2.add("Two");
        list2.add("Three");
        showListInfo(list2);
            //ограничиваем wildcard
        List<? extends Number> list3 = new ArrayList<Integer>();

        ArrayList<Double> list4 = new ArrayList<>();
        list4.add(5.8);
        list4.add(7.4);
        list4.add(3.14);
        System.out.println("Сумма : " + sum(list4));
    }

    static void showListInfo(List<?> list){
        System.out.println("элементы списка : " + list);
    }

    public static double sum(ArrayList<?extends Number> list){
        double sum =0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
