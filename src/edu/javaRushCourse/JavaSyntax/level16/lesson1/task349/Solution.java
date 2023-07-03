package edu.javaRushCourse.JavaSyntax.level16.lesson1.task349;

/**
 * Давай создадим класс, который взламывает аккаунт Лжепрезидента.
 *
 * В отдельном файле создай класс AccountHacker, который реализует интерфейс AutoCloseable,
 * чтобы объекты этого типа можно было использовать в try-with-resources.
 *
 * В классе AccountHacker создай публичный конструктор без параметров, который выводит сообщение "Initializing connection...".
 *
 * Также в классе AccountHacker создай публичный метод hackAccount(), который выводит сообщение "Hacking account...".
 *
 * Метод close() должен выводить на экран фразу "Hack completed.".
 *
 * В методе main класса Solution вызови метод hackAccount() в блоке try.
 *
 * В итоге вывод на экран должен быть следующим:
 *
 * Initializing connection...
 *
 * Hacking account...
 *
 * Hack completed.
 * Требования:
 * •	Класс AccountHacker должен поддерживать интерфейс AutoCloseable.
 * •	Конструктор класса AccountHacker должен быть публичным и выводить на экран фразу "Initializing connection...".
 * •	Метод hackAccount класса AccountHacker должен выводить на экран фразу "Hacking account...".
 * •	Метод close класса AccountHacker должен выводить на экран фразу "Hack completed.".
 * •	В методе main класса Solution у объекта класса AccountHacker должен быть вызван метод hackAccount.
 * •	Вывод на экран должен соответствовать условию задачи.
 * •	Метод close класса AccountHacker не должен быть вызван явно.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        try (AccountHacker ac = new AccountHacker())
        {
            ac.hackAccount();


        }
    }
}
