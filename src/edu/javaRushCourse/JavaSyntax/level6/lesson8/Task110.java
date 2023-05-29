package edu.javaRushCourse.JavaSyntax.level6.lesson8;

import java.util.Arrays;

/**
 * Судя по результату "бомбардировки", не все роботанки были уничтожены.
 * Давай допишем программу таким образом, чтобы "бомбардировки" продолжались до тех пор, пока не будут уничтожены все роботанки.
 * Обрати внимание, что делать "бомбардировку" с тем же расположением бомб бессмысленно.
 *
 * В результате работы программы должен быть выведен в консоль массив field (один раз), в котором нет ни одного "живого" роботанка.
 *
 * Требования:
 * •	"Бомбардировки" должны продолжаться до тех пор, пока в массиве field не останется ни одного роботанка.
 * •	Массив field должен быть выведен на экран после всех "бомбардировок".
 */
public class Task110 {
    public static String robotank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int width = 30;
    public static int height = 10;
    public static String[][] field = new String[height][width];
    public static int[][] bombs = new int[height][width];

    public static void main(String[] args) {
        for (int i = 0; i < field.length; i++) {
            Arrays.fill(field[i], empty);
        }

        for (int i = 0; i < field.length; i++) {
            int j = (int) (Math.random() * width);
            field[i][j] = robotank;


        }

        for (int i = 0; i < bombs.length; i++) {
            int bombCount = 10;
            while (bombCount > 0) {
                int j = (int) (Math.random() * width);
                if (bombs[i][j] == 0) {
                    bombs[i][j] = 1;
                    bombCount--;
                }
            }
        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (bombs[i][j] == 1 && robotank.equals(field[i][j])) {
                    field[i][j] = hit;
                }
            }
        }
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field[i].length; j++){
                if(robotank.equals(field[i][j])){
                    field[i][j] = hit;
                }
            }
        }


        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

}
