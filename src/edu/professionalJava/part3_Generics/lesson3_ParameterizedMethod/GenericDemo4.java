package edu.professionalJava.part3_Generics.lesson3_ParameterizedMethod;

import java.util.ArrayList;
import java.util.List;

import static edu.professionalJava.part3_Generics.lesson3_ParameterizedMethod.GenMethod.getSecondEllement;

public class GenericDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("two");
        list.add("three");
        String val = getSecondEllement(list);
        System.out.println(val);
    }
}

class GenMethod{

    public static <T> T getSecondEllement(ArrayList<T> list){
        return list.get(1);
    }
}
