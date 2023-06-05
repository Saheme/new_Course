package edu.javaRushCourse.JavaSyntax.level9.lesson6;

/**
 * setFlag(int number, int flagPos) — устанавливает значение "1" биту под индексом flagPos числа number и возвращает новое значение.
 * resetFlag(int number, int flagPos) — устанавливает значение "0" биту под индексом flagPos числа number и возвращает новое значение.
 * checkFlag(int number, int flagPos) — проверяет значение бита под индексом flagPos числа number и возвращает true, если значение "1" и false, если "0".
 * Требования:
 * •	Реализуй метод setFlag(int, int) согласно условию.
 * •	Реализуй метод resetFlag(int, int) согласно условию.
 * •	Реализуй метод checkFlag(int, int) согласно условию.
 */
public class Task186 {
    public static int setFlag(int number, int flagPos) {
        return number | (1 << flagPos);
    }

    public static int resetFlag(int number, int flagPos) {
        return number & ~(1 << flagPos);
    }

    public static boolean checkFlag(int number, int flagPos) {
        //напишите тут ваш код
        return (number & (1 << flagPos)) == (1 << flagPos);
    }
}
