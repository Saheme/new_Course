package edu.javaCourse.lesson_20_ArrayList.classWork.methodsArrayList;

import java.util.Arrays;

public class Methods7 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 5, 6, 7};

        char[] array3 = {'p', 'r', 'i', 'v', 'e', 't'};
        char[] array4 = {'p', 'r', 'i', 'v', 'i', 'v', 'k', 'a'};


        //18. compare(type[ ] a,type[ ] a ) -> int , имеет много перегруж.методов .
        //Сравнивает (лексикографически ) два однотипных объекта и возвращает < 0 , если первый объект меньше второго и возвращает > 0 если наоборот. Если массивы равны то возврашает 0
        System.out.println(Arrays.compare(array2,array1));
        System.out.println(Arrays.compare(array3,array4));

        System.out.println();
        //19. mismatch() -> int

        System.out.println(Arrays.mismatch(array1,array2));
        System.out.println(Arrays.mismatch(array3,array4));

    }
}
