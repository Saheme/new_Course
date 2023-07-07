package edu.javaRushCourse.JavaSyntax.level16.classWork;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo {
    public static void main(String[] args) {
        try(Reader reader =new FileReader("test2.txt"))
        {
//            int i=0;
//            while ((i=reader.read()) !=-1){
//                System.out.print((char) i);
            char[] chars = new char[250];
            while (reader.read(chars)!=-1){
                for (int i = 0; i < chars.length; i++) {
                    if (Character.isAlphabetic(chars[i])||Character.isWhitespace(chars[i])){
                    System.out.print(chars[i]);
                }
            }}


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
