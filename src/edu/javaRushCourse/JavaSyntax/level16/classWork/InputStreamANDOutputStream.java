package edu.javaRushCourse.JavaSyntax.level16.classWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamANDOutputStream {
    public static void main(String[] args) throws IOException {
        InputStream input = new FileInputStream("C:\\Users\\roj-t\\OneDrive\\Desktop\\B\\OIP.jfif");
        int i = 0;
        while ((i=input.read())!=-1){
            System.out.print(i);
        }
    }
}
