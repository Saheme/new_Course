package edu.javaRushCourse.JavaSyntax.level6.lesson4;

/**
 * С помощью продвинутой работы с массивами нужно запрограммировать Кибердракона так, чтобы он поймал зараженный галабагами роботанк.
 *
 * Измени инициализацию и заполнение массива array на быструю. Массив должен быть заполнен так, чтобы в консоль выводилась фраза "Mission complete".
 * Остальной код программы не изменяй.
 *
 * Требования:
 * •	В классе Solution должна быть публичная статическая переменная array типа String[].
 * •	Проинициализируй переменную array и заполни массив с помощью "быстрого заполнения" согласно условию.
 * •	Не изменяй остальной код программ
 */
public class Task97 {
    public static String[] array;

    public static void main(String[] args) {
        array = new  String[]{"robotank", "Diego", "Amigo", "Diego", "Amigo", "Diego"};


        boolean isMissionComplete = false;
        for (int i = 0; i < array.length; i++) {
            if ("robotank".equalsIgnoreCase(array[i])) {
                isMissionComplete = true;
                break;
            }
        }
        System.out.println(isMissionComplete ? "Mission complete" : "Mission not completed");
    }
}
