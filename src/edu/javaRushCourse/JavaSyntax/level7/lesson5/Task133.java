package edu.javaRushCourse.JavaSyntax.level7.lesson5;

/**
 * Правильное решение задачи превращает демонов в погрузочные машины. Нужно сделать так, чтобы в обоих методах (main и changeDemons)
 * использовалась одна и та же переменная demons.
 * Используй знания о видимости переменных.
 *
 * Требования:
 * •	В классе Solution должна быть публичная статическая переменная demons типа String, проинициализированная при объявлении значением "демоны".
 * •	В классе Solution должен быть публичный статический метод void changeDemons().
 * •	Вызов метода changeDemons() должен присваивать переменной demons класса Solution значение "погрузочные машины".
 * •	В методе main класса Solution переменной demons не должно присваиваться значение с помощью оператора присваивания.
 * •	В методе main класса Solution должен быть вызван метод changeDemons().
 * •	В результате работы программы в консоль должна быть выведена фраза "Друзья превратили демонов в погрузочные машины.".
 */
public class Task133 {
    public static String demons = "демоны";
    public  static void main(String[] args) {

        if ("демоны".equals(demons)) {
            System.out.println("На друзей напали демоны.");
        }
        changeDemons();
        if ("погрузочные машины".equals(demons)) {
            System.out.println("Друзья превратили демонов в погрузочные машины.");
        }
    }

    public static void changeDemons() {
        String demons = "погрузочные машины";
        Task133.demons =demons;
    }
}
