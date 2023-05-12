package edu.javaCourse.lesson_18_Array.classWork;

import java.util.Arrays;

public class ArrayMethodsDemo {
    public static void main(String[] args) {
        int[] array = {1, 5, 7, 9, 6, -4, 0, 8};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //1. метод sort() ->, сортирует массив от меньшего к большему
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n--------------------------");

        //2. Arrays.binarySearch(array, value), выполняет поиск , в определенном массиве , определенное значение , возвращает индекс ячейки, где эллемент храниться.
        //Будет работать корректно, только в отсортированном массиве.Если эллемент не найден- будет возвращать отрицательное значение.
        int index1 = Arrays.binarySearch(array, 5);
        System.out.println(index1);
    }
}
