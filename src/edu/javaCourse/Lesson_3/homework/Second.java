package edu.javaCourse.Lesson_3.homework;

public class Second {
    public static void main(String[] args) {
        int a = 5;
        int res = a-- - --a + ++a + a++ + a;
        System.out.println(res);
        System.out.println();
        int b = 8;
        int res2 =  ++b - b++ +  ++b - --b;
        System.out.println(res2);
    }
}
