package edu.professionalJava.part9_IO_And_NIO.lesson15_PathANDFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class PathANDFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");
//        Files.delete(filePath);
//        Files.createFile(filePath);
//        String talking = "-Hi!\n-How're you?\n-Grete! And you?\n-Fine!";
//        Files.write(filePath,talking.getBytes());
        List<String> list = Files.readAllLines(filePath);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
