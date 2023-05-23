package edu.javaRushCourse.JavaSyntax.level4.lesson4;

import java.util.Scanner;

/**
 * Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
 * Слово "enough" выводить не нужно.
 * Для этого необходимо использовать бесконечный цикл (while(true)).
 * <p>
 * Подсказка: чтобы завершить бесконечный цикл, используй оператор break.
 * <p>
 * Требования:
 * •	Программа должна считывать данные c клавиатуры.
 * •	В программе необходимо использовать цикл while.
 * •	Для завершения бесконечного цикла необходимо использовать оператор break.
 * •	Программа должна выводить в консоли все введенные данные с новой строки, пока не будет введено слово "enough".
 */
public class Task59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        while (true) {
            str = scan.nextLine();
            if (!str.equals("enough")) {
                System.out.println(str);
            } else {
                break;
            }
        }
    }
}
