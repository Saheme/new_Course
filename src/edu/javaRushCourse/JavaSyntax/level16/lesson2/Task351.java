package edu.javaRushCourse.JavaSyntax.level16.lesson2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/**
 * Напиши программу, которая считывает из консоли имя текстового файла, далее читает символы из этого файла (используй метод readAllLines(Path) класса Files) и выводит на экран все, за исключением точки, запятой и пробела.
 *
 * Требования:
 * •	Программа должна считать с консоли путь к файлу.
 * •	Программа должна вывести в консоль содержимое файла согласно условию.
 * •	Для чтения строк из файла должен быть использован метод readAllLines(Path) класса Files.
 * •	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
 */
public class Task351 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
        List<String> reader = Files.readAllLines(Path.of(scan.nextLine()));
        for (String element : reader) {
            char[] elements = element.toCharArray();
            for (char eachelement : elements) {
                if (eachelement != '.' && eachelement != ',' && eachelement != ' ') {
                    System.out.print(eachelement);
                }
            }
        }
    } catch (Exception exception) {
        System.out.println("Something went wrong: " + exception);
    }
}
}
