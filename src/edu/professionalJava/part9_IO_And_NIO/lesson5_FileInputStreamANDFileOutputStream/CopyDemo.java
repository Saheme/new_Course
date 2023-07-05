package edu.professionalJava.part9_IO_And_NIO.lesson5_FileInputStreamANDFileOutputStream;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) {
        try
                (FileInputStream input = new FileInputStream("E:\\Java\\logo_java.jpg");
                 FileOutputStream output = new FileOutputStream("logo_java.jpg"))
                 {
                     int i;
                     while ((i=input.read())!=-1){
                        output.write(i);
                 }
                     System.out.println("Done!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
