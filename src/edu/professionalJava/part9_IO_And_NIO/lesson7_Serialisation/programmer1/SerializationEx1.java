package edu.professionalJava.part9_IO_And_NIO.lesson7_Serialisation.programmer1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {


        List<String> employees = new ArrayList<>();
        employees.add("Alex");
        employees.add("Valy");
        employees.add("Nasty");
        try
                (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees1.bin"))) {
            {
            outputStream.writeObject(employees);
                System.out.println("Done!");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
