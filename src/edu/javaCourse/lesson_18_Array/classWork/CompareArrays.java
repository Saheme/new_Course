package edu.javaCourse.lesson_18_Array.classWork;

public class CompareArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 7, 9, 6, -4, 0, 8};
        int[] array2 = {1, 5, 7, 9, 6, -4, 0, 8};
        System.out.println(array1==array2);
        System.out.println("-----------------------");
         int [] array3 = array2;
        System.out.println(array3==array2);


    }
}


//int[] array23 = {6, 9, 3, 6, -4, 0, 8, 2};