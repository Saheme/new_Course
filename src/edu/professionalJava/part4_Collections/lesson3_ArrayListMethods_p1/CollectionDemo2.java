package edu.professionalJava.part4_Collections.lesson3_ArrayListMethods_p1;

import java.util.ArrayList;

public class CollectionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Alex");
        arrayList1.add("Valy");
        arrayList1.add("Jonn");

        //1 add(DataType elements) -> boolean
        arrayList1.add("Vasiliy");
        arrayList1.add(1,"Tamara");
        System.out.println(arrayList1);
        System.out.println("-------------------");
        //2. get(int index) -> DataType
        System.out.println(arrayList1.get(3));
        System.out.println("-------------------");
        //3.set(int index, DataType elements)
        arrayList1.set(3, "Arnold");
        System.out.println(arrayList1);
        System.out.println("-------------------");
        //4. remove(Object element)  ->boolean
        //   remove(int index)  ->boolean
        arrayList1.remove("Arnold");
        arrayList1.remove(1);
        System.out.println(arrayList1);

    }

}
