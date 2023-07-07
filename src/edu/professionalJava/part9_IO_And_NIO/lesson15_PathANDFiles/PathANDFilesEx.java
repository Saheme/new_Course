package edu.professionalJava.part9_IO_And_NIO.lesson15_PathANDFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathANDFilesEx {
    public static void main(String[] args) {
        Path filePath = Paths.get("test10.txt");
        Path directoryPath = Paths.get("C:\\Users\\roj-t\\OneDrive\\Desktop\\Ex");
        Path directoryPathB = Paths.get("C:\\Users\\roj-t\\OneDrive\\Desktop\\B");
        try {
            Files.copy(filePath,directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING); // копирует из файла в файл с созданием нового файла в директории
            // если такой фаил уже существует ,чтобы его перезаписать надо использовать: StandardCopyOption.REPLACE_EXISTING
            Files.copy(filePath,directoryPath.resolve("newFile"), StandardCopyOption.REPLACE_EXISTING); // копирует из файла в файл с созданием нового файла в директории
            Files.copy(directoryPathB,directoryPath.resolve("Sister"),StandardCopyOption.REPLACE_EXISTING);
            Files.move(filePath,directoryPath.resolve("test.150"));
            System.out.println("Done!");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
