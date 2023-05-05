package edu.javaCourse.lesson_6.homeWork.first;

public class HomeOverloadingTest {
    public static void main(String[] args) {

        HomeOverloading hO = new HomeOverloading();
        int sum1 = hO.sum();
        System.out.println(sum1);
        int sum2 = hO.sum(5);
        System.out.println(sum2);
        int sum3 = hO.sum(5, 7);
        System.out.println(sum3);
        int sum4 = hO.sum(5, 9, 3);
        System.out.println(sum4);
        int sum5 = hO.sum(5, 9, 3, 12);
        System.out.println(sum5);
    }
}
