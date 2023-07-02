package edu.javaCourse.lesson_27_Exeptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExDemo6 {
    static int abc(){
        File file = new File("test");
        try {
            FileInputStream fis = new FileInputStream(file);
            return 5;
        } catch (FileNotFoundException e) {
            System.out.println("exception " + e);
            return 6;
        }
        finally {
            System.out.println("This finally");
        }

    }
    public static void main(String[] args) {
        System.out.println(abc());;
    }
}
