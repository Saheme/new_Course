package edu.professionalJava.part9_IO_And_NIO.lesson6_DataInputStreamANDDataOutputStream;

import java.io.*;

public class DateStreamsDemo {
    public static void main(String[] args) {
        try
                (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("my_test.bin")); // создаем файл и записываем в него примитивные типы данных
                 DataInputStream inputStream = new DataInputStream(new FileInputStream("my_test.bin"))) // вы читываем из файла примитивы
        {
            outputStream.writeBoolean(true);
            outputStream.writeByte(57);
            outputStream.writeDouble(25.78);
            outputStream.writeInt(500);
            outputStream.writeLong(1_000_00L);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readDouble());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readLong());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
