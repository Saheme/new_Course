package edu.javaCourse.lesson_19_Varargs.classWork.foreachDemo;

public class ForeachDemo3 {
    public static void main(String[] args) {
        int [][] array = {{5,1,9,7},
                          {0,6,7,4},
                         {9,2,3,8}};

        for (int[] numbers: array) {
            for (int line : numbers ) {
                System.out.print(line + " ");
            }
            System.out.println();
        }
    }
}
