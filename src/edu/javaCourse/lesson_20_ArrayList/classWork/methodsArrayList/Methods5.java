package edu.javaCourse.lesson_20_ArrayList.classWork.methodsArrayList;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Methods5 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        // 15. Arrays.asList(DataType[]) -> List <DataType[]>, в параметры передаем массив какого то типа, на выходе получаем List этого типа

        StringBuilder[] array = {sb1, sb3, sb2, sb3};
        List<StringBuilder> list1 = Arrays.asList(array);
        System.out.println(list1);

        array[0].append("!!!");
        System.out.println(list1);
        array[0] = new StringBuilder("hello!");
        System.out.println(list1);




    }
}
