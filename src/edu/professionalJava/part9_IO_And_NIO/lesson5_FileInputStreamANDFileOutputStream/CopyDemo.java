package edu.professionalJava.part9_IO_And_NIO.lesson5_FileInputStreamANDFileOutputStream;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) {
        try
                (FileInputStream fileInputStream = new FileInputStream("E:\\Java\\logo_java.jpg");
                 FileOutputStream fileOutputStream = new FileOutputStream("logo_java.jpg"))
                 {
                     int i;
                     while ((i=fileInputStream.read())!=-1){
                        fileOutputStream.write(i);
                 }
                     System.out.println("Done!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
