package edu.javaRushCourse.JavaSyntax.level2.lesson6;

/**
 * Заполни пробелы пустотой... или наоборот.
 * <p>
 * Используй переменную emptiness, строки с одним пробелом и конкатенацию строк, чтобы записать в переменную fullness строку "пустота пустота пустота".
 * <p>
 * Требования:
 * •	Не изменяй значение переменной emptiness.
 * •	Переменную fullness нужно инициализировать в одну строку, используя переменную emptiness, строки с одним пробелом и конкатенацию строк.
 * •	Программа должна выводить на экран значение переменной fullness.
 */
public class Task22 {
    public static void main(String[] args) {
        String emptiness = "пустота";

        String fullness = emptiness + " " + emptiness + " " + emptiness; //напишите тут ваш код

        System.out.println(fullness);
    }
}
