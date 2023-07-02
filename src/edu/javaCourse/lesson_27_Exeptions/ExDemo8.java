package edu.javaCourse.lesson_27_Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExDemo8 {
    FileInputStream fis1, fis2;
    public void abc(){
        try {
        fis1 = new FileInputStream("test");
            try {
                fis2 = new FileInputStream("test1");
            }catch (FileNotFoundException ex){
                System.out.println("test1 не найден");
            }
            }
        catch (FileNotFoundException ex){
        System.out.println("test не найден") ;
        }
        finally {
            System.out.println("Это внешний finally блок");
            try {
                fis1.close();
                fis2.close();
            }catch (IOException ex){
                System.out.println("finally перехват");
            }
        }
    }

    public static void main(String[] args) {
        ExDemo8 e =new ExDemo8();
        e.abc();
    }
}
