package edu.javaCourse.lesson_27_Exeptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsDemo {
    public static void main(String[] args)  {
        File file = new File("test");

        try {
            Scanner scanner = new Scanner(file);
            System.out.println("после scanner");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        System.out.println("После блока try-catch");

    }
}
