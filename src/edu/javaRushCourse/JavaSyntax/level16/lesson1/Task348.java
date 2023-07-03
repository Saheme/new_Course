package edu.javaRushCourse.JavaSyntax.level16.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Программа считывает с консоли путь к файлу, читает строки из файла и выводит их на экран.
 * Перепиши код программы с использованием try-with-resources: вынеси в круглые скобки создание объектов с внешними ресурсами.
 * Не забудь удалить ненужный блок finally и вызовы метода close().
 * <p>
 * Требования:
 * •	Программа должна считать с консоли путь к файлу, далее считать строки из файла и вывести их на экран.
 * •	В программе должен использоваться оператор try-with-resources согласно условию.
 * •	У оператора try-with-resources не должно быть блока finally.
 * •	У объектов с внешними ресурсами не должен вызываться метод close() явно.
 * •	Не используй следующие классы File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
 */
public class Task348 {
    public static void main(String[] args) throws IOException {

        try (Scanner scanner = new Scanner(System.in);
             BufferedReader bufferedReader = Files.newBufferedReader(Path.of(scanner.nextLine())))
             {
                 String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}


//    Scanner scanner = null;
//    BufferedReader bufferedReader = null;
//        try {
//        scanner = new Scanner(System.in);
//        String fileName = scanner.nextLine();
//        bufferedReader = Files.newBufferedReader(Path.of(fileName));
//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            System.out.println(line);
//        }
//    } catch (IOException e) {
//        System.out.println("Something went wrong : " + e);
//    } finally {
//        if (scanner != null) {
//            scanner.close();
//        }
//        if (bufferedReader != null) {
//            bufferedReader.close();
//        }
//    }
//}