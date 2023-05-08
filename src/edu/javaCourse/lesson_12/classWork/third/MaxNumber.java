package edu.javaCourse.lesson_12.classWork.third;

public class MaxNumber {

    public static void maxNum(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " maximum.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " maximum");
        }else {
            System.out.println(num3 + " maximum");
        }

    }
}

