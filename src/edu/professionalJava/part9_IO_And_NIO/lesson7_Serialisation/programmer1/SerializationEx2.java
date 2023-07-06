package edu.professionalJava.part9_IO_And_NIO.lesson7_Serialisation.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx2 {
    public static void main(String[] args) {
      // Car car1 = new Car("BMW", "red");
      //  Car car2 = new Car("Toyota","black");
        Employee empl = new Employee("Alex","Noskow" ,"Sailing",46,15000);
        Employee empl2 = new Employee("Nasty","Kapleva", "Tutour",38,10000);
        List <Employee> list = new ArrayList<>();
        list.add(empl);
        list.add(empl2);
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees2.bin")))
        {
            outputStream.writeObject(list);
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
