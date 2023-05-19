package edu.javaCourse.lesson_21.Garbage.classWork;

public class TernaryOperatorDemo {
    public static void main(String[] args) {
        int a =5;
        String result = (a < 5) ? "less" : "more";
        System.out.println(result);

        System.out.println();
        int b =5;
        int i = a < 6? a++ : b++;
        System.out.println(i);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
