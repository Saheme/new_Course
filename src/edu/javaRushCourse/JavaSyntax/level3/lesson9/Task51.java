package edu.javaRushCourse.JavaSyntax.level3.lesson9;

/**
 * Протодактили захватили склад Фабрики Еды. Их надо обезвредить и вернуть склад под контроль.
 * Чтобы вернуть контроль над складом, нужно ввести пароль большими буквами. Но протодактили поломали кнопку CapsLock.
 *
 * Тебе нужно зайти в систему и изменить программу валидации пароля, чтобы она принимала пароль независимо от регистра.
 *
 * Требования:
 * •	Исправь сравнение строк в блоках
 */
public class Task51 {
    public static void main(String[] args) {
        System.out.println("Чтобы вернуть контроль над складом введите пароль:");

        if ("QWERTY".equalsIgnoreCase("qwerty")) {
            System.out.println("Контроль получен");
        } else {
            System.out.println("Пароль неверный");
        }

    }
}
