package edu.professionalJava.part9_IO_And_NIO.lesson3_Try_With_Resources;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TWRDemo {
    public static void main(String[] args) throws IOException {
        String str = "I never love my wife!!!";
        try (FileWriter writer = new FileWriter("test3.txt");
             FileReader reader = new FileReader("test3.txt")) {
            writer.write(str);
            System.out.println("I did it!!!");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("I read");

        }
    }
}
