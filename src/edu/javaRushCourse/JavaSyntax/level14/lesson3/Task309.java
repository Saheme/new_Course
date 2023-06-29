package edu.javaRushCourse.JavaSyntax.level14.lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Нужно срочно исправить социальный рейтинг работника станции. Рейтинг устанавливается числами от -5 до 10 методом setRatings,
 * который в случайном порядке добавляет 20 элементов с рейтингом в список ratingsList.
 *
 * Твоя задача — исправить рейтинг работника и убедиться, что самые высокие рейтинги отображаются в начале списка.
 *
 * Для этого тебе требуется:
 *
 * В методе changeNegativeNumbers заменить любые негативные числа в списке ratingsList на противоположные, позитивные.
 * Например, -1 должно стать 1, -5 должно стать 5, и т. д.
 * В методе changeZerosToMaximumNumber заменить все нули на максимальное позитивное число/значение в списке ratingsList.
 * В методе reverseList отсортировать все элементы списка ratingsList по убыванию.
 * Пример:
 *
 * Если при вызове метода setRatings в методе main список инициализируется такими значениями: 1 -4 -4 4 0 -3 -3 -5 -2 -2 4 1 -1 0 2 4 3 8 -5 6.
 * То при выводе на экран результата работы метода improveRatings должно получиться: 8 8 8 6 5 5 4 4 4 4 4 3 3 3 2 2 2 1 1 1.
 *
 * Метод main не участвует в проверке.
 *
 * Требования:
 * •	Не изменяй строку, где создаётся переменная ratingsList.
 * •	Не изменяй методы setRatings, improveRatings и printList.
 * •	Реализуй метод changeNegativeNumbers согласно условиям.
 * •	Реализуй метод changeZerosToMaximumNumber согласно условиям.
 * •	Реализуй метод reverseList согласно условиям.
 */
public class Task309 {
    public static List<Integer> ratingsList = new ArrayList<>();

    public static void main(String[] args) {
        setRatings();
        printList(); // before
        improveRatings();
        printList(); // after
    }

    public static void changeNegativeNumbers() {
        for (int i = 0; i < ratingsList.size(); i++) {
            if (ratingsList.get(i)<0){
                Collections.replaceAll(ratingsList,ratingsList.get(i),Math.abs(ratingsList.get(i)));
            }
        }
    }

    public static void changeZerosToMaximumNumber() {
        Integer max = Collections.max(ratingsList);
        Collections.replaceAll(ratingsList,0,max);
    }

    public static void reverseList() {
        Collections.sort(ratingsList);
        Collections.reverse(ratingsList);
    }

    public static void improveRatings() {
        changeNegativeNumbers();
        changeZerosToMaximumNumber();
        reverseList();
    }

    private static void setRatings() {
        int rating;
        Random random = new Random();
        int min = -5;
        int max = 11;

        for (int i = 0; i < 20; i++) {
            rating = random.nextInt(max - min) + min;
            ratingsList.add(rating);
        }
    }

    private static void printList() {
        ratingsList.forEach((value) -> System.out.print(value + " "));
        System.out.println();
    }
}
