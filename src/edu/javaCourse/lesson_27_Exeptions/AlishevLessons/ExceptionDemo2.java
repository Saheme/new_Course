package edu.javaCourse.lesson_27_Exeptions.AlishevLessons;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) throws ScannerException {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int num = Integer.parseInt(scan.nextLine());
            if (num != 0) {
                throw new ScannerException("Ввели не ноль");
            }

            }
        }
    }

