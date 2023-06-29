package edu.professionalJava.part4_Collections.lesson6_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Alex");
        list.add("Valy");
        list.add("Jonn");
        list.add("Vasiliy");
        list.add("Arnold");
        System.out.println(list);

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
             it.next();
            it.remove();
        }
        System.out.println(list);
    }
}
