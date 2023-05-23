package edu.javaRushCourse.JavaSyntax.level3.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Напиши программу, которая считывает с клавиатуры два вещественных числа (double) и выдает сообщение о том, равны ли эти числа с точностью до одной миллионной.
 * <p>
 * Требования:
 * Программа должна считывать два числа c клавиатуры.
 * Если числа равны, то программа должна вывести сообщение "числа равны".
 * Если числа не равны, то программа должна вывести сообщение "числа не равны".
 * Точность сравнения должна достигать одной миллионной (0.000001).
 */
public class Task47 {
    public static void main(String[] args) throws IOException {
           Scanner scan = new Scanner(System.in);
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            String result = (Math.abs(b-a)<0.000001)? "числа равны":"числа не равны";
            System.out.println(result);
        }
    }

