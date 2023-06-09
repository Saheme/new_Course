package edu.professionalJava.part9_IO_And_NIO.lesson2_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
    public static void main(String[] args) throws IOException {
        FileReader reader=null;
        try {
            reader = new FileReader("test2.txt");
            int character;
            while ((character = reader.read())!=-1){
                System.out.print((char) character);
            }
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);

        }finally {
            reader.close();
        }
    }
}
