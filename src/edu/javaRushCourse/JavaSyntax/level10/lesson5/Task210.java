package edu.javaRushCourse.JavaSyntax.level10.lesson5;

import java.util.Arrays;

/**
 * Моральный блок Стального Стива заполнен вредоносными элементами, которые делают пиратского капитана очень кровожадным и аморальным.
 * <p>
 * В этой задаче требуется в методе cleanMorals исправить статический массив morals класса Solution, заменив негативные моральные элементы на позитивные.
 * <p>
 * Для этого требуется:
 * <p>
 * Заменить все элементы, в которых присутствует текст "killer" (без учета регистра), на слово "compassion" (сострадание).
 * Заменить все элементы, в которых присутствует текст "thief" (без учета регистра), на слово "fairness" (справедливость).
 * Заменить все элементы, в которых присутствует текст "bully" (без учета регистра), на слово "respect" (уважение).
 * Метод main не участвует в проверке.
 * <p>
 * Требования:
 * •	Не изменяй массив morals в классе Solution.
 * •	Метод cleanMorals должен изменять массив morals согласно условиям.
 */
public class Task210 {
    public static String[][] morals = {{"iAmAKiller", "iAmAThief", "honesty", "responsibility", "iAmABully"},
            {"BuLLyIAmA", "honesty", "iamakiller", "iamathief", "responsibility"},
            {"honesty", "iamabully", "responsibility", "AthiefIAm", "ikillerAmA"},
    };

    public static void main(String[] args) {
        for (String[] strings : morals) {
            System.out.println(Arrays.toString(strings));
        }
            System.out.println("-------------------------------------------------------- ");
        cleanMorals();
        for (String[] strings : morals) {
            System.out.println(Arrays.toString(strings));
        }
    }

    public static void cleanMorals() {
        String exampl = "";
        for (int i = 0; i < morals.length; i++) {
            for (int j = 0; j < morals[i].length; j++) {
                exampl = morals[i][j].toLowerCase();
                if (exampl.contains("killer")) {
                    morals[i][j] = "compassion";
                }
                else if (exampl.contains("thief")) {
                    morals[i][j] = "fairness";
                }
                else if (exampl.contains("bully")) {
                    morals[i][j] = "respect";
                }
            }
        }
    }
}

