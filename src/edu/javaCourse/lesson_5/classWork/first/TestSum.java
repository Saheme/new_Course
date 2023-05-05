package edu.javaCourse.lesson_5.classWork.first;

public class TestSum {
    public static void main(String[] args) {
        Sum sum = new Sum();
        int sumOfThreeNumbers = sum.additionNumbers(5, 8, 4);
        System.out.println(sumOfThreeNumbers);
        System.out.println("--------------");

        int averageSum = sum.countAverageSum(5,7,13);
        System.out.println(averageSum);
    }
}
