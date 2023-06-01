package edu.javaRushCourse.JavaSyntax.level7.lesson6;

import java.util.Scanner;

/**
 * Теперь реализуем саму битву — метод battle(). Добавь в класс Solution публичный статический метод void battle. В этом методе Амиго будет атаковать,
 * а Диабло — защищаться и контратаковать до тех пор, пока кто-то из них не лишиться всех "жизней".
 * Если Амиго атаковал, а Диабло не защитился (зона защиты Диабло не совпала с зоной атаки Амиго), то Диабло теряет "жизни" — вызываем соответствующий метод.
 * Если же Диабло защитился, он сразу же контратакует и Амиго теряет "жизнь" (снова вызываем нужный метод).
 * <p>
 * Кроме этого мы будем выводить в консоль ход битвы: если Диабло смог защититься, то выводим фразу из переменной diabloDefendPhrase.
 * Если же удар Амиго попал в цель, то выводим в консоль значение amigoAttackPhrase. Не забудь вызвать метод battle() в методе main после вызова метода findDiablo().
 * <p>
 * Требования:
 * •	В классе Solution должен быть публичный статический метод void battle().
 * •	Метод battle() не должен ничего делать, если кто-то из соперников не имеет "жизней".
 * •	Метод battle() должен вывести на экран значение поля diabloDefendPhrase и вызвать метод amigoLostLife(), в том случае,
 * если Диабло защитился (amigoAttacks() == diabloDefends()).
 * •	Метод battle() должен вывести на экран значение поля amigoAttackPhrase и вызвать метод diabloLostLife(), в том случае, если Диабло не смог защититься.
 * •	В методе main нужно вызвать метод battle() после вызова метода findDiablo().
 */
public class Task138 {
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

    public static void battle() {
        while (!(amigoLives == 0) && !(diabloLives == 0))
            if (amigoAttacks() == diabloDefends()) {
                System.out.println(diabloDefendPhrase);
                amigoLostLife();
            } else {
                System.out.println(amigoAttackPhrase);
                diabloLostLife();
            }

    }


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
        amigoLives = amigoLives - 1;
    }

    public static void diabloLostLife() {
        diabloLives = diabloLives - 3;
    }

    public static int amigoAttacks() {
        return getRandomNumber(3);
    }

    public static int diabloDefends() {
        return getRandomNumber(3);
    }


    public static void main(String[] args) {
        Task138.diabloPosition = getRandomNumber(4);

        findDiablo();
        battle();
    }

    public static int getRandomNumber(int range) {
        return (int) (Math.random() * range) + 1;
    }
}
