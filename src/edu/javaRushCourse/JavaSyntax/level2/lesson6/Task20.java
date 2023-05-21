package edu.javaRushCourse.JavaSyntax.level2.lesson6;

/**
 * Надо проверить код машины и Робокрастинатора. Потому что если уж встретил проблему, то всегда проверяй ее код, вдруг он работает некорректно.
 * Так-так, экран не работает. Сломан код ввода данных.
 * Нужно написать код вывода в консоль адреса, тогда Диего и Амиго смогут уехать на такси.
 *
 * Используя только переменные latitude, longitude, numberS, numberF, comma, выведи в консоль координаты:
 * 40.728189,-74.0428987
 *
 * Требования:
 * •	Текст должен выводиться согласно условию.
 * •	Используй конкатенацию строк (знак +) 5 раз в выводе текста.
 * •	Нельзя добавлять новые переменные или изменять текущие.
 */
public class Task20 {
    public static void main(String[] args) {
        String latitude = "40.7281";
        String longitude = "-74.042";
        String numberS = "87";
        String numberF = "89";
        String comma = ",";
        System.out.println(latitude +numberF+ comma+longitude+numberF+numberS);
    }
}
