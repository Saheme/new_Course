package edu.javaRushCourse.JavaSyntax.level13.lesson6;

import java.util.ArrayList;
import java.util.List;

public class Task295Answer {
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
        List<String> correctWords = new ArrayList<>();

        for (int i = 0; i < secretMessage.size(); i += 3) {
            String part = secretMessage.get(i);
            correctWords.add(part);
        }
        return correctWords;
    }
}
