package edu.javaCourse.lesson_27_Exeptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExDemo7 {
    static void abc()throws FileNotFoundException{
        File file = new File("test");
        try {
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("exception " + e);
            throw e;
        }
        finally {
            System.out.println("This finally");
        }
    }
//    public void def(){
//        try {
//    int[] array = {1,5,9};
//        System.out.println(array[5]);
//        }
//        catch (ArrayIndexOutOfBoundsException ex){
//            System.out.println("exception caught");
//            throw ex;
//        }
//    }

    void method (){
        try {
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("exception caught");
        }
    }
}
