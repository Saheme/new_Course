package edu.professionalJava.part9_IO_And_NIO.lesson7_Serialisation.programmer2;

import edu.professionalJava.part9_IO_And_NIO.lesson7_Serialisation.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializableEx2 {
    public static void main(String[] args) {
        List<Employee> list;
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees2.bin")))
        {
            list = (List<Employee>) inputStream.readObject();
            for (Employee employee : list) {
                System.out.println(employee);
            }





        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }}
