package edu.javaCourse.lesson_20_ArrayList.homeWork;
/**
 * Создайте клас в котором создайте метод abc.Input параметром метода  будет N-е количество параметров класса String
 *Метод должен возврашать уже отсортированныйобъект ArrayList из неповторяющихся объектов типа String, взятых из параметра методов
 * и выводить ванный объект на экран
 */

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListHome {
    public ArrayList<String> abc(String... str) {
        ArrayList<String>list = new ArrayList<>();
        for (String line:str) {
            if (!list.contains(line)) {
            list.add(line);
            }
        }
            Collections.sort(list);
        System.out.println(list);
        return  list;
    }

    public static void main(String[] args) {
        ArrayListHome ht = new ArrayListHome();
       ht.abc("four","six","three","one","seven","one");


    }

}

  /* if (str[i].equals(str)) {
                list.remove(str);
            }*/