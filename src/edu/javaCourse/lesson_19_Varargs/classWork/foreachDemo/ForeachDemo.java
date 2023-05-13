package edu.javaCourse.lesson_19_Varargs.classWork.foreachDemo;

public class ForeachDemo {
    public static void main(String[] args) {

        int[] array = {5, 8, 6, 2, 0, 7, -7, -1};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n-----------------");
        for (int line : array) {
            System.out.print(line + " ");
        }

        System.out.println();
            int sum=0;
        for (int number: array) {
            sum +=number;
        }
            System.out.println(sum);




    }
}
