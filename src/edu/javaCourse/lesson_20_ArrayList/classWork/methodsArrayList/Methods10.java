package edu.javaCourse.lesson_20_ArrayList.classWork.methodsArrayList;

import java.util.ArrayList;
import java.util.List;

public class Methods10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println("list : " + list);

        System.out.println("\n-----------------------");
        //22. subList(int fromIndex, int toIndex) -> List<E> дает возможность посмотреть заданный отрезок ArrayList, не создавая его копии или другог объекта
        List<String> list2 = list.subList(2,5);
        System.out.println(list2);
        System.out.println("\n-----------------------");

        //23. List.of(E ... elements) -> List<E> , создает и инициализирует List(ArrayList нельзя), без метода add(), не может содержать null
        List<String> list3 = List.of("odin","dva","tri");
        System.out.println(list3);
        System.out.println("\n-----------------------");

        //24. List.copyOf(Collection <E> c) -> List<E>, принимает коллекцию и возвращает нейзменяемый List, не может содержать null
        List<String> list4 = List.copyOf(list);
        System.out.println(list4);

    }
}
