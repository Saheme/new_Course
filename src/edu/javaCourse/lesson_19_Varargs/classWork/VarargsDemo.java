package edu.javaCourse.lesson_19_Varargs.classWork;

public class VarargsDemo {
    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void sum(String str,int ...a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
             summa += a[i];
        }
        System.out.println(str + summa);
    }

    public static void main(String[] args) {
        sum("Summa = ",7,5);
    }
}
