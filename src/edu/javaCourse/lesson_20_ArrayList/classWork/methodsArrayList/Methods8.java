package edu.javaCourse.lesson_20_ArrayList.classWork.methodsArrayList;

import java.util.ArrayList;

public class Methods8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println("list : " +list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("one");
        list2.add("three");
        list2.add("four");
        list2.add("ten");

        System.out.println("list2 : " +list2);


        System.out.println("\n-----------------------");

        // 20.removeAll(Collection <> c) -> boolean, удаляет из первого ArrayLIst такие же эллементы как во втором ArrayLIst.
       /* list.removeAll(list2);

        System.out.println("list : " +list);
        System.out.println("list2 : " +list2);*/

        System.out.println("\n-----------------------");
        //21. retainAll(Collection <> c) -> boolean , в первом ArrayLIst будут сохраненны акие же эллементы как во втором ArrayLIst
        list.retainAll(list2);
        System.out.println("list : " +list);
        System.out.println("list2 : " +list2);

    }
}
