package edu.javaCourse.lesson_18_Array.classWork;

public class ArrayTask {

    public static void arrayMaxAndMIn(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Max = " + max + " " + "Min = " + min);
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 7, 9, 6, -4, 0, 8};
        arrayMaxAndMIn(array);
    }

}
