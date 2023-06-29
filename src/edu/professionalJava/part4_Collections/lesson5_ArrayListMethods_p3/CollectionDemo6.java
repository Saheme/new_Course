package edu.professionalJava.part4_Collections.lesson5_ArrayListMethods_p3;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo6 {
    public static void main(String[] args) {
        //listOf(E...elements)->List E
        List<Integer> list = List.of(3,5,7,9);
        System.out.println(list);


        //ListCopyOf(Collection<E>c)->List<E>
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Alex");
        arrayList1.add("Valy");
        arrayList1.add("Jonn");
        arrayList1.add("Vasiliy");
        arrayList1.add("Arnold");

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);









    }
}
