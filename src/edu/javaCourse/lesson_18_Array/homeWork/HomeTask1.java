package edu.javaCourse.lesson_18_Array.homeWork;

import java.util.Arrays;

public class HomeTask1 {

    public static int[] sortirovka(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - 1; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        for (int list : array) {
            System.out.print(list + " ");
        }
        return array;
    }

    public static int[] sortirovka2(int[] array) {
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        for (int list : array) {
            System.out.print(list + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 5, 7, 9, 6, -4, 0, 8, -8, 100};
        for (int list : array1) {
            System.out.print(list + " ");
        }
        System.out.println("\n------------");
        sortirovka(array1);
        System.out.println("\n------------");
        sortirovka2(array1);


    }
}
