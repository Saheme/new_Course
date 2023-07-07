package edu.javaRushCourse.JavaSyntax.level16.lesson2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Нужно разобраться, с каких сайтов Лжепрезидент берёт фейки и заполняет ими Инстаматрицу.
 * В данный момент ссылки на эти ресурсы зашифрованы в формате Unicode в методе getSources.
 *
 * Для расшифровки будет использован метод decodeSources. В этом методе тебе потребуется:
 *
 * В переданный по ссылке файл (первый параметр) записать информацию из переданного по ссылке массива (второй параметр).
 * Каждый ресурс должен быть записан в файл с новой строки.
 * Hint: с этим может помочь класс BufferedWriter.
 * Используя метод readAllLines(Path) класса Files, метод decodeSources должен возвращать расшифрованную информацию в виде списка (List<String>).
 * Ссылку на файл (в методе readDecodedInformation) для записи расшифрованной информации можно менять на свою.
 * В нашем случае все зашифрованные сайты — из .com доменов.
 *
 * В итоге вывод на экран должен быть:
 *
 * facebook.com
 * cnn.com
 * twitter.com
 * Требования:
 * •	Не изменяй метод getSources.
 * •	Не изменяй метод main.
 * •	Не изменяй метод readDecodedInformation.
 * •	Метод decodeSources должен работать согласно условию.
 * •	Вывод на экран должен соответствовать условию задачи.
 */
public class Task352 {
    public static void main(String[] args) {
        readDecodedInformation();
    }

    public static void readDecodedInformation() {
        try {
            String outputFile = "output.txt";
            List<String> sourcesList = decodeSources(outputFile, getSources());
            sourcesList.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Source error. Check your link or file.");
        }
    }

    public static char[] getSources() {
        return new char[]{'\u0066','\u0061','\u0063','\u0065','\u0062','\u006f','\u006f','\u006b','\u002e','\u0063','\u006f','\u006d',
                '\u0063','\u006e','\u006e','\u002e','\u0063','\u006f','\u006d',
                '\u0074','\u0077','\u0069','\u0074','\u0074','\u0065','\u0072','\u002e','\u0063','\u006f','\u006d'};
    }

    public static List<String> decodeSources(String fileName, char[] array) throws IOException {
        try (FileWriter fw = new FileWriter(fileName, StandardCharsets.UTF_8);
             BufferedWriter writer = new BufferedWriter(fw)) {
            for (char c : array) {
                writer.append(c);
                if (c == 'm') {
                    writer.append("\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Files.readAllLines(Paths.get(fileName));


        }

    }

