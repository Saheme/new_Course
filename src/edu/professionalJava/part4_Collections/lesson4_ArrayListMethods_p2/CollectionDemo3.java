package edu.professionalJava.part4_Collections.lesson4_ArrayListMethods_p2;

import java.util.ArrayList;

public class CollectionDemo3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Alex");
        arrayList1.add("Valy");
        arrayList1.add("Jonn");
        arrayList1.add("Vasiliy");
        arrayList1.add("Arnold");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("One");
        arrayList2.add("Two");
        arrayList2.add("Tree");
        //5. addAll(ArrayList al)
        //   addAll(int index ,ArrayList al)
        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);
        arrayList1.addAll(2,arrayList2);
        System.out.println(arrayList1);

        //6. clear()-> void
        arrayList1.clear();
        System.out.println(arrayList1);
        System.out.println("-------------");
        arrayList1.add("Alex");
        arrayList1.add("Valy");
        arrayList1.add("Jonn");
        arrayList1.add("Arnold");
        arrayList1.add("Vasiliy");
        arrayList1.add("Arnold");
        System.out.println(arrayList1);
        // 7. indexOf(Object element) ->int
        System.out.println(arrayList1.indexOf("Arnold"));
        System.out.println(arrayList1.indexOf("Sasha"));

        //8. lastIndexOf (Object element) ->int
        System.out.println(arrayList1.lastIndexOf("Arnold"));
        System.out.println("-------------");
        //9.size()->int
        System.out.println(arrayList1.size());

        //10 isEmpty()->boolean
        System.out.println(arrayList1.isEmpty());
        arrayList1.clear();
        System.out.println(arrayList1.isEmpty());
        System.out.println("-------------");
        //11. contains(Object element)->boolean
        arrayList1.add("Alex");
        arrayList1.add("Valy");
        arrayList1.add("Jonn");
        arrayList1.add("Arnold");
        arrayList1.add("Vasiliy");
        arrayList1.add("Arnold");
        System.out.println(arrayList1);
        System.out.println(arrayList1.contains("Arnold"));

    }
}
