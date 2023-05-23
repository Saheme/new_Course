package edu.javaRushCourse.JavaSyntax.level3.lesson7;

import java.util.Locale;
import java.util.Scanner;

public class Task47Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        double firstDouble = scanner.nextDouble();
        double secondDouble = scanner.nextDouble();

        if (Math.abs(secondDouble - firstDouble) < 0.000001) {
            System.out.println("числа равны");
        } else {
            System.out.println("числа не равны");
        }
    }
}
//      1.000001
//        1.000002