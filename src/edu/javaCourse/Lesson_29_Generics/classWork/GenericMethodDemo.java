package edu.javaCourse.Lesson_29_Generics.classWork;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodDemo {
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(25);
        arr.add(278);
int a = GenMethod.getSecondElement(arr);
        System.out.println(a);

        ArrayList<String>arr1 = new ArrayList<>();
        arr1.add("I'm a boy");
        arr1.add("I'm a beast");
        String str = GenMethod.getSecondElement(arr1);
        System.out.println(str);
    }

}

class GenMethod{
    public static  <T> T getSecondElement(ArrayList<T> arrayList){
        return arrayList.get(1);
    }
}

