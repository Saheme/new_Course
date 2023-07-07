package edu.professionalJava.part9_IO_And_NIO.lesson10_File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("test2.txt");// относительный путь
        File folder =new File("C:\\Users\\roj-t\\OneDrive\\Desktop\\Ex"); //абсолютный путь
        File file2 = new File("C:\\Users\\roj-t\\OneDrive\\Desktop\\Ex\\test10.txt");
        File folder2 =new File("C:\\Users\\roj-t\\OneDrive\\Desktop\\Demo"); //абсолютный путь
        System.out.println(file.getAbsoluteFile()); // получаем абсолютный путь
        System.out.println(folder.getAbsoluteFile()); // получаем абсолютный путь до папки
        System.out.println("---------------");

        System.out.println(file.isAbsolute()); // проверяет, наш путь к файлу абсолютный
        System.out.println(folder.isAbsolute());
        System.out.println("---------------");

        System.out.println(file.isDirectory()); // проверяет, является ли наш файл директорией
        System.out.println(folder.isDirectory());
        System.out.println("---------------");

        System.out.println(file.exists()); // проверяет, существует ли наш файл или директория
        System.out.println(folder.exists());
        System.out.println(file2.exists());
        System.out.println(folder2.exists());
        System.out.println("---------------");

        System.out.println(file2.createNewFile()); // создает файл
        System.out.println(folder2.mkdir()); // создает директорию
        System.out.println(file2.exists());
        System.out.println(folder2.exists());
        System.out.println("---------------");

        System.out.println(file2.length()); // размер файла
        System.out.println(folder.length()); // папки
        System.out.println("---------------");

        System.out.println(file2.delete()); //удаляет файл
        System.out.println(folder2.delete()); // удаляет папку только в том случае если папка пустая
        System.out.println("---------------");


        File[] files = folder.listFiles();// возвращает массив типа File с содержимым папки
        System.out.println(Arrays.toString(files));

        System.out.println(file.isHidden()); // скрытый ли файл или папка
        System.out.println("---------------");

        System.out.println(file.canRead());// проверяет есть разрешение на чтение
        System.out.println(file.canWrite()); // проверяет есть разрешение на запись
        System.out.println(file.canExecute()); // проверяет есть разрешение на запуск
    }
}
