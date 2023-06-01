package edu.javaRushCourse.JavaSyntax.level7.lesson6;

import java.util.Scanner;

/**
 * В классе Solution добавь поля (переменные), которые будут отвечать за количество жизней Амиго и Диабло: amigoLives и diabloLives.
 * Присвой каждой из этих переменных значение 9 (сразу в строке инициализации). Далее добавим методы, вызов которых будет уменьшать "жизни".
 * <p>
 * В классе Solution создай public static void методы:
 * <p>
 * amigoLostLife(), в котором уменьши переменную amigoLives на 1;
 * diabloLostLife(), в котором уменьши переменную diabloLives на 3.
 * Далее нам понадобятся методы атаки (Амиго) и защиты (Диабло):
 * создай public static метод amigoAttacks(), который вернет случайное число в диапазоне от 1 до 3 (воспользуйся вспомагательным методом getRandomNumber);
 * создай public static метод diabloDefends(), который также вернет случайное число в диапазоне от 1 до 3 (диапазоны зон атаки и защиты должны совпадать).
 * Требования:
 * •	В классе Solution должна быть публичная статическая переменная amigoLives типа int, которой нужно присвоить значение 9.
 * •	В классе Solution должна быть публичная статическая переменная diabloLives типа int, которой нужно присвоить значение 9.
 * •	В классе Solution должен быть публичный статический метод void amigoLostLife(), реализованный согласно условию.
 * •	В классе Solution должен быть публичный статический метод void diabloLostLife(), реализованный согласно условию.
 * •	В классе Solution должен быть публичный статический метод int amigoAttacks(), реализованный согласно условию.
 * •	В классе Solution должен быть публичный статический метод int diabloDefends(), реализованный согласно условию.
 */
public class Task137 {
    public static int amigoLives = 9;
    public static int diabloLives = 9;
    public static String getFirstPositionPhrase = "Помоги Амиго определить, где спрятался Диабло? Введи номер позиции (1, 2, 3 или 4):";
    public static String getPositionPhrase = "Диабло не обнаружен. Давай попробуем снова. Введи номер позиции (1, 2, 3 или 4):";
    public static String findDiabloPhrase = "Амиго обнаружил Диабло.";
    public static String diabloDefendPhrase = "Амиго атакует. Диабло отбил атаку Амиго и нанес ответный удар.";
    public static String amigoAttackPhrase = "Удар Амиго достиг цели. Диабло потерял 3 жизни.";
    public static String winPhrase = "Амиго одержал победу над Диабло и выбил из его головы загадочный кристалл.";
    public static String loosePhrase = "Диабло победил Амиго.";
    public static int diabloPosition;

    public static void findDiablo() {
        System.out.println(getFirstPositionPhrase);
        boolean isExit = false;
        Scanner scan = new Scanner(System.in);
        while (!isExit) {
            int place = scan.nextInt();
            if (place == diabloPosition) {
                System.out.println(findDiabloPhrase);
                isExit = true;
            } else {
                System.out.println(getPositionPhrase);
            }
        }

    }

    public static void amigoLostLife() {
        amigoLives--;
    }

    public static void diabloLostLife() {
        diabloLives -= 3;
    }

    public static int amigoAttacks(){
        return getRandomNumber(3);
    }
    public static int diabloDefends(){
        return getRandomNumber(3);
    }


    public static void main(String[] args) {
        Task137.diabloPosition = getRandomNumber(4);

        findDiablo();
    }

    public static int getRandomNumber(int range) {
        return (int) (Math.random() * range) + 1;
    }
}
