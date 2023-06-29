package edu.professionalJava.part4_Collections.lesson5_ArrayListMethods_p3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionDemo5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Alex");
        arrayList1.add("Valy");
        arrayList1.add("Jonn");
        arrayList1.add("Vasiliy");
        arrayList1.add("Arnold");
        System.out.println(arrayList1);
        arrayList1.add("Four");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("One");
        arrayList2.add("Two");
        arrayList2.add("Tree");
        arrayList2.add("Vasiliy");
        arrayList2.add("Four");

        // removeAll(Collection<?>c)-> boolean
        //arrayList1.removeAll(arrayList2);
       // System.out.println(arrayList1);

//        //retainAll(Collection<?>c)-> boolean
  //    arrayList1.retainAll(arrayList2);
   //   System.out.println(arrayList1);

        //containsAll(Collection<?>c)-> boolean

        System.out.println(arrayList1.containsAll(arrayList2));

        //subList(int fromIndex, int toIndex)->List<E>
        List<String> list = arrayList1.subList(2, 4);
        System.out.println(list);
        list.add("Dop");
        System.out.println(list);
        System.out.println(arrayList1);

        //toArray()->Object[]
        Object[] objects = arrayList1.toArray();
        System.out.println("Это массив из list "+Arrays.toString(objects));
        // toArray(T[] a)-> T[]
        String[] str = arrayList1.toArray(new String[0]);
        System.out.println("Это массив String из list "+Arrays.toString(str));


    }
}
