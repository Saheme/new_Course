package edu.javaCourse.lesson_27_Exeptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExDemo5 {
    public static void main(String[] args) {
        File file = new File("test2");
        try {
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException ex) {
            System.out.println("exception 1");
        } catch (NullPointerException ex) {
            System.out.println("exception 2");
        } catch (IOException ex) {
            System.out.println("exception 3");
        } catch (RuntimeException ex) {
            System.out.println("exception 4");
        } catch (Exception ex) {
            System.out.println("exception 5");
        } catch (Throwable ex) {
            System.out.println("exception 6");
        }
    }
}
