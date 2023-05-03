package edu.javaCourse.Lesson_3.examples;

public class Classwork3_2 {
    public static void main(String[] args) {
        boolean x = false;
        boolean y = true;
        boolean z = false;
        boolean result = x || y || z;
        System.out.println(result);

        boolean result2 = !y;
        System.out.println(result2);
        System.out.println();
        int a = 10;
        int b = 50;
        int c = 99;
        int d = 100;
        boolean e = a > b & ++c == d;
        System.out.println(e);
        System.out.println(c);
        System.out.println();

        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = true;
        boolean b5 = b1 ^ b2 ^ b3 ^ b4;
        System.out.println(b5);

        int k = 10;
        int g = 3;
        int r = ++k - g * 2;
        System.out.println(r);

    }
}
