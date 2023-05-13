package edu.javaCourse.lesson_19_Varargs.classWork.foreachDemo;

public class ForeachDemo4 {
    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] =i*10;
        }
        for (int number: array) {
            System.out.print (number+ " ");
        }

    }

}
