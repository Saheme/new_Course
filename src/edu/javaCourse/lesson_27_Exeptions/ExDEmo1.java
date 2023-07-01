package edu.javaCourse.lesson_27_Exeptions;

import javax.imageio.IIOException;
import java.io.*;

public class ExDEmo1 {
    public static void main(String[] args)  {
        File file = new File("test");
        try {
        FileInputStream fis = new FileInputStream(file);
        fis.read();
            System.out.println("FileInputStream создан");
        }catch (FileNotFoundException ex){
            System.out.println("Такого файла не существует, исключение : " + ex);
        }catch (IOException ex){
            System.out.println("IOException : " + ex);
        }
        finally {

        }
       // FileOutputStream fos = new FileOutputStream(file);
        //fos.write(100);


    }
}
