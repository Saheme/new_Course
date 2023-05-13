package edu.javaCourse.lesson_20_ArrayList.classWork.methodsArrayList;

import java.util.ArrayList;

public class Methods1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //1. add(Datatype element)-> boolean, добавляет эллемент в коллекцию
        // add(int index,Datatype element)->boolean, добавляет эллемент в коллекцию с заданного индекса

        list.add("Hello!");
        list.add("Goodbye!");
        list.add("monster");
        list.add(1, "month");

        for (String value : list) {
            System.out.print(value + " ");
        }
        System.out.println("\n-----------------------");

        //2. get(int index)-> DataType, возвращает эллемент по индексу ячейки.
        System.out.println(list.get(3));

        System.out.println("\n-----------------------");

        //3. set(int index, DataType element)->DataType, указывается индекс и элемент который надо поместить в этот индекс(заменяет уже имеющееся значие
        list.set(2, "Kukaracha");
        for (String value : list) {
            System.out.print(value + " ");
        }
        System.out.println("\n-----------------------");

        //4. remove(Object element) -> boolean, удаляет элемент по значению объекта, у обекта надо удалять ссылку
        //   remove(int index) -> DataType, удаляет элемент по индексу

        list.remove("Hello!");
        for (String s: list) {
            System.out.println(s + " ");
        }
            System.out.println();
       list.remove(2);
        for (String value : list) {
            System.out.print(value + " ");
        }
    }
}
