package edu.javaRushCourse.JavaSyntax.level14.lesson2.classWork;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello!");
        list.add("Привет!");
        list.add("Hola!");
        list.add("Bonjour!");
        list.add("Cialo");
        // Удаление элемента в цикле для ArrayList
        for (int i = 0; i < list.size(); i++) {
           String str = list.get(i);
            if (list.get(i).equals("Hello!")){
                list.remove(str);
                i--;    // нужно уменьшить i, т.к. после удаления элементы сдвинулись
            }
        }
        System.out.println(list);
        // Для HashSet и HashMap - с помощью итератора.
        Iterator <String> iter = list.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            if (str.equals("Hello!")){
                iter.remove();
            }
        }
        System.out.println(list);

        // Использовать копию коллекции.
        ArrayList<String>listCopy = new ArrayList<>(list);
        for (String str : listCopy) {
            if (str.equals("Hello!")){
                list.remove(str);
            }}
            System.out.println(list);




    }
}
