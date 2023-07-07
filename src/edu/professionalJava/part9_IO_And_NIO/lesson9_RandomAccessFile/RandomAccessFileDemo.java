package edu.professionalJava.part9_IO_And_NIO.lesson9_RandomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class RandomAccessFileDemo {
    public static void main(String[] args) {
        try
                (RandomAccessFile file = new RandomAccessFile("test3.txt", "rw")) {
           // int a = file.read(); //читает по 1 байту
            //System.out.println((char) a);
            String str = file.readLine(); // читает целую строку
            System.out.println(str);
            file.seek(100); //перемешает курсор в 100 позицию
            String str2 = file.readLine();
            System.out.println(str2);
            long position = file.getFilePointer(); // показывает в какой позиции находится курсор
            System.out.println(position);
            file.seek(0);
            file.writeBytes("Hello"); // перезаписывает старый текст ,словом "Hello"
            file.seek(file.length()-1);// ставим курсор в конец файла
            file.writeBytes("Song \"Volcano\"");


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
