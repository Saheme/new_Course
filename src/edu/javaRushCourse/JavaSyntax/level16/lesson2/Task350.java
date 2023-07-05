package edu.javaRushCourse.JavaSyntax.level16.lesson2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Напиши программу, которая считывает с консоли путь к файлу1 и путь к файлу2. Далее все байты из файла1 записывает в файл2,
 * но при этом меняет их местами по такому принципу: первый со вторым, третий с четвертым, и т.д.
 * Если последний байт в файле1 нечетный, то пишем его в файл2 как есть.
 * Для чтения и записи файлов используй методы newInputStream и newOutputStream класса Files.
 *
 * Требования:
 * •	Программа должна считать с консоли пути к файлам.
 * •	Программа должна переписывать байты из одного файла в другой согласно условию.
 * •	Для чтения и записи файлов должны быть использованы методы newInputStream и newOutputStream класса Files.
 * •	Потоки для чтения и записи должны быть закрыты.
 * •	Не используй следующие классы File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
 */
public class Task350 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in);
            FileInputStream input = new FileInputStream(scanner.nextLine());
            FileOutputStream output = new FileOutputStream(scanner.nextLine()))
        {
//            int i;
//            while ((i=input.read())!=-1){
//                output.write(i);
//            }
            byte[]buffer = new byte[65536];
            for (int i = 0; input.available()>0; i++) {
                buffer[i] =(byte) input.read();
            }
            byte temp;
            for (int i = 0; i < buffer.length; i++) {
                temp = buffer[i];
                buffer[i] = buffer[i+1];
                buffer[i+1] = temp;
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

//  E:\Java\file1.txt
//  E:\Java\file2.txt
