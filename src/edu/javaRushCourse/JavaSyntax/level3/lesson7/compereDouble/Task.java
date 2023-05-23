package edu.javaRushCourse.JavaSyntax.level3.lesson7.compereDouble;

import java.util.Locale;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH); // это надо использовать чтобы вводить вещественные числа с точкой вместо запятой
        double d = sc.nextFloat();
        System.out.println(d);
    }
}
