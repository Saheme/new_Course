package edu.professionalJava.part9_IO_And_NIO.lesson11_ChannelANDBuffer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class CNBDemo {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("test3.txt","rw");
            FileChannel channel = file.getChannel())

        {
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder song = new StringBuilder();
            int byteRead = channel.read(buffer);
            while (byteRead>0){
                System.out.println("Read : " + byteRead);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
