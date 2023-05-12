package edu.javaCourse.lesson_18_Array.classWork;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array1;  // declaration
        String[] array2;
        double[][] array3;

        array1 = new int[8];    // allocation
        array2 =new String[3];
        array3 = new double[2][3];

        System.out.println(array1.length);

        //initialization 1. статическая
        array1 [0] = 5 ;
        array1 [1] = 2 ;
        array1 [2] = 7 ;
        array1 [3] = -4 ;
        array1 [4] = 7 ;
        array1 [5] = 0 ;
        array1 [6] = -1 ;
        array1 [7] = 10 ;

        double [] array5 = new double[3];
        array5 [0] = 2.5;
        array5 [1] = 3.7;
        array5 [2] = 4.1;

        double[]    array7 = new double[2];
        array7[0] = 7.7;
        array7[1] = 1.6;

        array3[0] = array5;
        array3[1] = array7;


    }
}
