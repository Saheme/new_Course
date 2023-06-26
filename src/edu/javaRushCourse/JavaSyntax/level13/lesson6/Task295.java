package edu.javaRushCourse.JavaSyntax.level13.lesson6;

import java.util.ArrayList;
import java.util.List;

/**
 * Амиго и Диего нужно прочитать секретное послание, которое зашифровано в списке secretMessage.
 * В методе-расшифровщике decryptSecretMessage() требуется найти части слов, из которых состоит секретное сообщение, используя список secretMessage.
 *
 * Тот, кто оставил сообщение, не успел записать полный алгоритм расшифровки, но известно, что начиная с 0-го индекса требуется искать каждое 3-е слово.
 *
 * Правильное сообщение состоит из 58-и символов (включая пробелы).
 *
 * Hint: используй цикл for.
 *
 * Требования:
 * •	Не изменяй список secretMessage и метод main().
 * •	Метод decryptSecretMessage() должен возвращает список (List) с объектами типа String согласно условиям.
 * •	Метод main должен выводить правильный список decryptedMessage в одной строке, без добавления пробелов. Все нужные пробелы между словами уже учтены.
 */
public class Task295 {
    public static List<String> secretMessage = List.of(
            "защ", "ита", "тит", "ити", "e ", "от ", "те ", "пож", "баг", "от ", "алу", "йст", "ужа", "сно", "й ",
            "сны", "е ", "осв", "х г", "обо", "быс", "ала", "кти", "чны", "баг", "ско", "пле", "ов ", "рее", "ние",
            "и ", "реш", "отп", "выз", "ен ", "уск", "вол", "те ", "нос", "ите", "каж", "нет", " из", "но ", "все",
            " ин", "отк", "ите", "ста", "пож", "ар ", "мат", "алу", " бу", "риц", "рат.", "ыт.", "ы.");

    public static void main(String[] args) {
        List<String> decryptedMessage = decryptSecretMessage();

        for (String s : decryptedMessage) {
            System.out.print(s);
        }
    }

    public static List<String> decryptSecretMessage() {
        var temp = new ArrayList<String>();
        for (int i = 0; i < secretMessage.size(); i++) {
            if (i %3==0){
                temp.add(secretMessage.get(i));
            }
        }
        return temp;
    }
}
