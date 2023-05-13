package edu.javaCourse.lesson_20_ArrayList.classWork.methodsArrayList;

import java.util.ArrayList;

public class Methods4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);


        //13 clone() -> Object , создается новый объект, который ссылается на те же объекты, что и первоначальный

        ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>) list.clone();
        System.out.println(list == list2);
        System.out.println(list.equals(list2));

        System.out.println("-------------------");
        // 14 toArray() -> Object [] , из ArrayList извлекаем массив Object []
        //  toArray(SataType [] array ) -> DataType[] извлекаем массив такого же типа как и ArrayList

        Object[] array1 = list.toArray();

        for (Object line:array1) {
            System.out.print(line + " ");
        }
        System.out.println("\n-------------------");

        StringBuilder [] array2 = list.toArray(new StringBuilder[10]);
        for (StringBuilder line:array2) {
            System.out.print(line + " ");
        }

    }
}
