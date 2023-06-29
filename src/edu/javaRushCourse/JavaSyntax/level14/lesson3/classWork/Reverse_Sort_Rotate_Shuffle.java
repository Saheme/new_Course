package edu.javaRushCourse.JavaSyntax.level14.lesson3.classWork;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_Sort_Rotate_Shuffle {
    public static void main(String[] args) {
        //Collection.reverse(List<T> list) - Метод reverse() меняет порядок переданных в него элементов списка на обратный.
        ArrayList <Integer> list = new ArrayList<>();
        Collections.addAll(list , 1,2,3,4,5);
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("-------------");

        //Collection.sort(List<T> list) - Метод sort() сортирует переданный в него список по возрастанию.
        ArrayList <Integer> list1 = new ArrayList<>();
        Collections.addAll(list1,13,4,23,56,5,25);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println("-------------");

        //Collection.rotate(List <T> list, int distance) - Метод rotate() циклическим образом сдвигает переданные в него элементы на distance позиций вперед.

        ArrayList <Integer> list3 = new ArrayList<>();
        Collections.addAll(list3 , 1,2,3,4,5,6,7,8,9);
        System.out.println(list3);
        Collections.rotate(list3,4);
        System.out.println(list3);
        System.out.println("-------------");

        //Collections.shuffle(List<T> list)- Метод shuffle() случайным образом перемешивает все элементы переданного списка. Результат каждый раз разный.
        ArrayList <Integer> list4 = new ArrayList<>();
        Collections.addAll(list4 , 1,2,3,4,5,6,7,8,9);
        System.out.println(list4);
        Collections.shuffle(list4);
        System.out.println(list4);
    }
}
