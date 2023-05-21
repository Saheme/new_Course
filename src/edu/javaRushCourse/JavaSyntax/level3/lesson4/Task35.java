package edu.javaRushCourse.JavaSyntax.level3.lesson4;

import java.util.Scanner;

/**
 * Нужно отрегулировать скорость, с которой едет лифт. Иначе, разогнавшись, лифт запустит друзей на орбиту планеты.
 * <p>
 * Расставь знаки больше, меньше и равно, чтобы при скорости меньше 0 выводилась надпись: System error!
 * При скорости больше 3: Скорость лифта слишком высокая, снижаем...
 * При скорости меньше либо равно 3: Скорость лифта в норме
 * <p>
 * Требования:
 * •	При значении переменной speed от 0 до 3 (включительно), выведи в консоль: Скорость лифта в норме
 * •	При значении переменной speed меньше 0 (не включительно), выведи в консоль: System error!
 * •	При значении переменной speed больше 3 (не включительно), выведи в консоль: Скорость лифта слишком высокая, снижаем...
 */
public class Task35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();

        if (speed < 0)
            System.out.println("System error!");
        else if (speed > 3) {
            System.out.println("Скорость лифта слишком высокая, снижаем...");
            speed = 3;
        } else  {
            System.out.println("Скорость лифта в норме");
        }
    }
}
