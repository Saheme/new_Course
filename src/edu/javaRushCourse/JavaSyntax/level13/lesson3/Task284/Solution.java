package edu.javaRushCourse.JavaSyntax.level13.lesson3.Task284;

import java.util.ArrayList;

/**
 * Нашим друзьям требуется создать аккаунты в ИнстаМатрице, но список аккаунтов класса Accounts уже полностью заполнен, так как является примитивным массивом.
 *
 * Для возможности добавить новые аккаунты требуется:
 *
 * В методе convertAccounts класса Solution конвертировать массив аккаунтов класса Accounts через добавление
 * всех его элементов в список accountsList класса Solution.
 * В методе registerAccount класса Solution проверить входящий username на наличие его в списке accountsList и,
 * если такового в этом списке нет, добавить username в список accountsList.
 * В методе main вызвать метод convertAccounts.
 * В методе main два раза вызвать метод registerAccount и передать ему в параметрах имена "Амиго" и "Диего".
 * В методе main вывести на экран содержимое списка accountsList, каждый элемент с новой строки.
 * Требования:
 * •	Не изменяй класс Accounts и инициализацию списка accountsList в классе Solution.
 * •	В методе convertAccounts конвертируй массив в список согласно условию.
 * •	Метод registerAccount должен проверять и добавлять username согласно условию.
 * •	Метод main должен вызывать методы convertAccounts и registerAccount, а также печатать список accountsList, согласно условию.
 */
public class Solution {
    public static ArrayList<String> accountsList = new ArrayList<>();

    public static void main(String[] args) {
        convertAccounts();
        registerAccount("Амиго");
        registerAccount("Диего");

        for (String line : accountsList) {
            System.out.println(line);
        }
    }

    public static void convertAccounts() {
        for (int i = 0; i < Accounts.getAccounts().length; i++) {
            accountsList.add(i,Accounts.getAccounts()[i]);
        }

    }

    public static void registerAccount(String username) {
        if (!(accountsList.contains(username))){
            accountsList.add(username);
        }
    }
}
