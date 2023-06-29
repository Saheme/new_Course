package edu.javaRushCourse.JavaSyntax.level14.lesson3.classWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddAll_Fill_Replace_Copy {
    public static void main(String[] args) {
        // Collections.addAll(Collection <T> colls, T e1, T e2, T e3 ,...) - добавляет элементы в коллекцию colls

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,3,4,6,12);
        System.out.println(list);
        System.out.println("---------------");

        // Collections.fill(List<T> list, T obj) - Метод fill() заменяет все элементы коллекции list на элемент obj.
        Collections.fill(list,10);
        System.out.println(list);
        System.out.println("---------------");

        //Collections.nCopies(int n, T obj) - Метод nCopies() возвращает список из n копий элементов obj.
        // Список можно назвать фиктивным (реального массива внутри нет), поэтому изменять его нельзя! Можно использовать только для чтения.
        List<String> fake = Collections.nCopies(3, "Hello");
        System.out.println(fake);
        System.out.println("---------------");

        //Collection.replaceAll(List<T> list, T oldValue, T newValue) - заменяет все элементы коллекции list, равные oldValue, на элемент newValue.
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(2);
        System.out.println(list1);
        Collections.replaceAll(list1,2,30);
        System.out.println(list1);
        System.out.println("---------------");
        //Collections.copy(List <T> dest,List <T> src) - Метод copy() копирует все элементы коллекции src в коллекцию dest.
        //Коллекция dest должна иметь длину не меньше, чем длина коллекции src (иначе кинется исключение IndexOutOfBoundsException).
        ArrayList <Integer> src = new ArrayList<>();
        Collections.addAll(src, 99,98,97,96);

        ArrayList<Integer> dest = new ArrayList<>();
        Collections.addAll(dest, 1,2,3,4,5,6,7);

        Collections.copy(dest,src);
        System.out.println(dest);

    }
}
