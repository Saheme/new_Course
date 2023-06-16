package edu.professionalJava.part3_Generics.lesson1_IntroductionToGenerics;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo1 {
    public static void main(String[] args) {
        //      List list =new ArrayList();
//        list.add("Mother");
//        list.add(25);
//        list.add(25.78);
//        list.add(new StringBuilder("Roar"));
        List<String> list = new ArrayList<>();
        list.add("roar");
        list.add("fli[-flops");
        list.add("nothing special");
        list.add("sunbathe on the beach");
        //for (Object o : list) {
        for (String o : list) {
            //System.out.println(o + " lengths - " + ((String)o).length());
            System.out.println(o + " lengths - " + o.length());
        }
    }
}
