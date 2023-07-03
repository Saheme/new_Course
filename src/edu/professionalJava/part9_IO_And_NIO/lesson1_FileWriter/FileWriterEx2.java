package edu.professionalJava.part9_IO_And_NIO.lesson1_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx2 {
    public static void main(String[] args) throws IOException {
        String str = "Много лет размышлял я над жизнью земной.\n Непонятного нет для меня под луной.\nМне известно, " +
                "что мне ничего не известно!\n Вот последняя правда открытая мной.";
        String autor = "\n О. Хаям.";
        FileWriter writer = null;
        try {
            writer=new FileWriter("test3.txt",true);
            writer.write(str);
            writer.write(autor);
            System.out.println("Done!");
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            writer.close();
        }
}}
