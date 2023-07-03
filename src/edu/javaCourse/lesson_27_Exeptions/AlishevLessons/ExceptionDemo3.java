package edu.javaCourse.lesson_27_Exeptions.AlishevLessons;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        File file = new File("test1");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("file didn't find");
        }
    }
}
