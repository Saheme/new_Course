package edu.javaRushCourse.JavaSyntax.level14.lesson3.classWork;

import java.util.ArrayList;
import java.util.Collections;

public class Min_Max_Frequency_BinarySearch_Disjoint {
    public static void main(String[] args) {
        //Collections.min(Collection <T> colls)
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 23, 4, -58, 54);
        Integer min = Collections.min(list);
        System.out.println(min);
        System.out.println("--------------------------");

        //Collections.max(Collection <T> colls) - Метод max() возвращает максимальный элемент коллекции.
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 23, 4, -58, 54);
        Integer max = Collections.max(list);
        System.out.println(max);
        System.out.println("--------------------------");

        //Collections.frequency(Collection <T> colls, T obj) - Метод frequency() подсчитывает, сколько раз в коллекции colls встречается элемент obj
        ArrayList<Integer> list3 = new ArrayList<>();
        Collections.addAll(list3, 4, 6, 2, 5, 4, 7, 9, 4);
        int result = Collections.frequency(list3, 4);
        System.out.println(result);
        System.out.println("--------------------------");

        //Collections.binarySearch(Collection<T> colls, T obj) - Метод binarySearch() ищет элемент obj в коллекции colls.
        // Возвращает номер найденного элемента. Если элемент не найден, возвращает отрицательное число.
        //Перед вызовом метода binarySearch() коллекцию нужно отсортировать (Collections.sort()).
        ArrayList<Integer> list4 = new ArrayList<>();
        Collections.addAll(list4, 5, 3, 1, 8, 7, 10);
        Collections.sort(list4);
        int results = Collections.binarySearch(list4, 5);
        System.out.println(results);
        int results2 = Collections.binarySearch(list4, 2);
        System.out.println(results2);
        System.out.println("--------------------------");

        //Collections.disjoint(Collection<T> coll1, Collection<T> coll2) - Метод disjoint() возвращает true, если у переданных коллекций нет одинаковых элементов.

        ArrayList<Integer> list5 = new ArrayList<>();
        Collections.addAll(list5, 5, 3, 1, 8, 7, 10,9,99);
        ArrayList<Integer> list6 = new ArrayList<>();
        Collections.addAll(list6,96,97,98,99);
        boolean disjoint = Collections.disjoint(list5, list6);
        System.out.println(disjoint);
    }
}

