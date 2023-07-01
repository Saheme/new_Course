package edu.javaCourse.lesson_27_Exeptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExDemo4 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        try {
            File file = new File("test1");
            System.out.println("Объект file создан");
            FileInputStream fis = new FileInputStream(file);
            System.out.println("Поток fis создан");
            int counter = 0;
            while (true){
                counter++;
                result.append(fis.read());
                System.out.println("Информация считается");
                if (counter==3){
                    fis.close();
                }
            }
        }catch (FileNotFoundException ex){
            System.out.println("exception 1");
        }catch (IOException ex){
            System.out.println("exception 2");
        }finally {
            System.out.println("finally");
        }
    }
}
