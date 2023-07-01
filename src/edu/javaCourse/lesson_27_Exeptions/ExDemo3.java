package edu.javaCourse.lesson_27_Exeptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExDemo3 {

    void abc() throws FileNotFoundException {
        File file = new File("test2");
        FileInputStream fis = new FileInputStream(file);
        }


    void def() throws FileNotFoundException {
        System.out.println("Hello!");

        abc();

    }

    public static void main(String[] args)  {
        ExDemo3 ex =new ExDemo3();
        try {
        ex.abc();
        ex.def();
        }catch (FileNotFoundException exception) {
          exception.printStackTrace();
    }
}}

