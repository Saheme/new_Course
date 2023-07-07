package edu.professionalJava.part9_IO_And_NIO.lesson14_PathANDFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        Path filePath = Paths.get("test2.txt");
        Path directoryPath = Paths.get("C:\\Users\\roj-t\\OneDrive\\Desktop\\Ex");

        System.out.println("filePath.getFileName() : " + filePath.getFileName()); // возвращает имя файла расположенного по данному пути
        System.out.println("directoryPath.getFileName() : " + directoryPath.getFileName()); // возвращает имя директории расположенного по данному пути
        System.out.println("------------------");

        System.out.println("filePath.getParent() : " + filePath.getParent());
        System.out.println("directoryPath.getParent() : " + directoryPath.getParent());
        System.out.println("------------------");

        System.out.println("filePath.getRoot() : " + filePath.getRoot()); // указываем корневой каталог
        System.out.println("directoryPath.getRoot() : " + directoryPath.getRoot());
        System.out.println("------------------");

        System.out.println("filePath.toAbsolutePath() : " + filePath.toAbsolutePath()); // узнать абсолютный путь
        System.out.println("directoryPath.toAbsolutePath() : " + directoryPath.toAbsolutePath());
        System.out.println("------------------");

        System.out.println(directoryPath.resolve(filePath)); //к одному пути прибавляет второй
        System.out.println("------------------");

        if (!Files.exists(filePath)){
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        Path failPath2 = Paths.get("C:\\Users\\roj-t\\IdeaProjects\\new_Course\\test3.txt");
        try {
            List<String> list = Files.readAllLines(filePath);
            for (String s : list) {
                System.out.print(s);

            }
            System.out.println("----------------------------");
            Map<String, Object> attributes = Files.readAttributes(filePath, "*");
            for (Map.Entry<String,Object> entry: attributes.entrySet()) {
                System.out.println(entry);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(Files.isSameFile(filePath,failPath2));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
