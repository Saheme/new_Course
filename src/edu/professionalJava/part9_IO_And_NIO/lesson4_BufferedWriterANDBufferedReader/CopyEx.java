package edu.professionalJava.part9_IO_And_NIO.lesson4_BufferedWriterANDBufferedReader;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try
                (BufferedReader reader = new BufferedReader(new FileReader("test2.txt"));
                  BufferedWriter writer =new BufferedWriter(new FileWriter("test3.txt")))
                 {
                     // работаем с отдельными символами
//                int character;
//                while ((character=reader.read())!=-1) {
//                    writer.write(character);
//                }
                     // работаем с целой строкой
                     String line;
                     while ((line= reader.readLine())!=null){
                         writer.write(line);
                         writer.write('\n'); // переход на новую строку после записанной строки
                 }
                     System.out.println("Done!");
                 }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
