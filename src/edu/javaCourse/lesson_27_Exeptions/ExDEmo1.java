package edu.javaCourse.lesson_27_Exeptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExDEmo1 {
    public static void main(String[] args) throws Exception {
        File file = new File("test2");
        FileInputStream fis = new FileInputStream(file);
       fis.read();
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(100);


    }
}
