package edu.javaCourse.lesson_2.examples;

public class PrimitiveDataTapes {
    public static void main(String[] args) {
        byte b1 = 10;
        short s1 = -10;
        int i1 = 500;
        long l1 = 100000000000L;

        float f1 = 3.14F;
        double d1 = 5.5;

        char c1 = 'A';
        char c2 = 300;
        char c3 = '\u1254';

        boolean bool1 = true;
        boolean bool2 = false;
        System.out.print(b1 + " " + s1 + " " + i1 + " " + l1 + "\n");
        System.out.print(f1 + " " + d1 + "\n");
        System.out.print(c1 + " " + c2 + " " + c3 + "\n");
        System.out.println(bool1 + " " + bool2);
        System.out.println();

        int a1 = 60;
        int a2 = 0B00111100;
        int a3 = 074;
        int a4 = 0x3C;
        System.out.print(a1 + " " + a2 + " " + a3 + " " + a4);
    }
}
