package edu.javaRushCourse.JavaSyntax.level16.lesson2.classWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        String src = "E:\\Java\\presets.txt";
        try
                (FileInputStream input = new FileInputStream(src); // для чтения
                 FileOutputStream output = new FileOutputStream("test.txt"))// для записи
                {
                    byte[]buffer = new byte[65536]; // Буфер, в который будем считывать данные
                while (input.available()>0){ // Пока данные есть в потоке
                    int real = input.read(buffer); //Считываем данные в буфер
                    output.write(buffer,0,real); //Записываем данные из буфера во второй поток
                }


                } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
