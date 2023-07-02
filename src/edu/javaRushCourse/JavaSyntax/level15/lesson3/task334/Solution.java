package edu.javaRushCourse.JavaSyntax.level15.lesson3.task334;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * В этой задаче в классе Solution нужно создать метод с названием checkAnswers, который будет обрабатывать
 * ответы (число от 1 до 4 включительно), введенные с клавиатуры.
 * <p>
 * Данный метод должен быть публичным, статическим, и не возвращать никаких данных.
 * На вход он должен принимать переменные типа int, а также перекидывать исключения типа WrongAnswerException (см. отдельный класс).
 * <p>
 * В методе checkAnswers требуется создать switch, который будет обрабатывать передаваемое методу число типа int.
 * <p>
 * Switch должен состоять из 4-х опций:
 * <p>
 * Если в метод передаётся число 1, то должна создаваться и перекидываться новая ошибка типа WrongAnswerException с текстом "Не совсем...Даём тебе еще один шанс.".
 * Если в метод передаётся число 2, то должна создаваться и перекидываться новая ошибка типа WrongAnswerException с текстом "Я вижу ты любишь играть с огнём!".
 * Если в метод передаётся число 3, то должна создаваться и перекидываться новая ошибка типа WrongAnswerException с текстом "Еще один такой ответ, и мы сдадим тебя на металолом!".
 * Если в метод передаётся число 4, то на экран должно выводиться сообщение "Правильный ответ.".
 * Все нужные вопросы уже доступны в questions set и будут отображаться при запуске программы.
 * <p>
 * Требования:
 * •	Не изменяй класс WrongAnswerException.
 * •	Не изменяй questions set в классе Solution.
 * •	Не изменяй методы main и interrogation в классе Solution.
 * •	Метод checkAnswers должен быть создан согласно условиям.
 */
public class Solution {
    private static final Set<String> questions = new TreeSet<>(Arrays.asList(
            "Вопрос 1: Ваше любимое домашнее животное?\n1) Попугай, 2) Енот, 3) Собака, 4) Кот",
            "Вопрос 2: Какой твой любимый язык программирования?\n1) Kotlin, 2) C++, 3) JavaScript, 4) Java",
            "Вопрос 3: Самый лучший ресурс по Java?\n1) Google, 2) Yahoo, 3) Bing, 4) JavaRush",
            "Вопрос 4: Сколько ты будешь благодарить JavaRush за знания?\n1) >5 лет, 2) <5 лет, 3) Ни сколько, 4) Всегда"));

    public static void main(String[] args) {
        interrogation();
    }

    public static void interrogation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("От твоих ответов зависит твоя дальнейшая судьба!");

        for (String question : questions) {
            System.out.println(question);
            int answer = scanner.nextInt();
            while (answer >= 5) {
                System.out.println("Введи ответ от 1 до 4 (включительно).");
                answer = scanner.nextInt();
            }
            try {
                checkAnswers(answer);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void checkAnswers(int answer) throws WrongAnswerException {
        switch (answer) {
            case 1 -> throw new WrongAnswerException("Не совсем...Даём тебе еще один шанс.");
            case 2 -> throw new WrongAnswerException("Я вижу ты любишь играть с огнём!");
            case 3 -> throw new WrongAnswerException("Еще один такой ответ, и мы сдадим тебя на металолом!");
            case 4 -> System.out.println("Правильный ответ.");
        }
    }
}
