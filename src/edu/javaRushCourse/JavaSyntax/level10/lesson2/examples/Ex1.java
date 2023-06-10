package edu.javaRushCourse.JavaSyntax.level10.lesson2.examples;

import java.util.Arrays;
import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {

        Random random = new Random();
        int [][][] array = new int[8][6][7];
        for(int i = 0 ; i < array.length; i++ ){
            for(int j = 0 ; j < array[i].length; j++ ){
                for(int k = 0; k < array[j].length; k++) {
                    array[i][j][k] = random.nextInt(10);
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
