package edu.professionalJava.part9_IO_And_NIO.lesson9_RandomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class RandomAccessFileDemo {
    public static void main(String[] args) {
        try
                (RandomAccessFile file = new RandomAccessFile("test3.txt", "rw")) {
            int a = file.read(); //читает по 1 байту
            System.out.println((char) a);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
