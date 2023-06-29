package edu.professionalJava.part4_Collections.lesson5_ArrayListMethods_p3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionDemo4 {
    public static void main(String[] args) {
        StringBuilder sb1 =new StringBuilder("A");
        StringBuilder sb2 =new StringBuilder("B");
        StringBuilder sb3 =new StringBuilder("C");
        StringBuilder sb4 =new StringBuilder("D");
        StringBuilder sb5 =new StringBuilder("F");
        StringBuilder [] array = {sb1,sb2,sb3,sb4,sb5};


        //Arrays.asList(DataType[])-> List <DataType >

        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);
        array[0].append("!!!");
        System.out.println(list);


    }
}
