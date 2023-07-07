package edu.javaRushCourse.JavaSyntax.level16.classWork;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("test2.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("test4.txt"))) {
            {
          writer.write("Str1 ");
          writer.newLine();
          writer.write("Str2 ");
                while (reader.ready()) {
                    System.out.println(reader.readLine());
                }

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}
