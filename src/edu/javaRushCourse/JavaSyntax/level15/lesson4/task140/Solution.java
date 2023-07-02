package edu.javaRushCourse.JavaSyntax.level15.lesson4.task140;

/**
 * Котороботы построили гигантского кошкоподобного робота (Котзилла), но в его коде еще несколько ошибок, которые не дают начать полноценное тестирование и активацию Котзиллы.
 *
 * Код Котзиллы предоставлен в классе Catzilla, который состоит из 4-х переменных разного типа и 4-х методов, которые обращаются к этим переменным.
 *
 * Требуется исправить несколько ошибок в классе Catzilla, чтобы ушли ненужные ошибки. Для этого тебе следует:
 *
 * Исправить код метода overclockReactor(), чтобы программа не заканчивалась с ошибкой StackOverflowError.
 * Результатом работы метода должен быть вывод на экран текста "Reactor has been overclocked. 10 cores are ready.".
 * Исправить код метода enlargeFangs(), чтобы программа не заканчивалась с ошибкой NullPointerException.
 * Измени тип переменной fangStrength класса Catzilla на примитивный и инициализируй числом 5.
 * Метод enlargeFangs() должен увеличивать значение переменной fangStrength до 10. В результате работы метода на экран должен выводиться текст "Fangs are ready with strength 10.".
 * Исправить код метода generateExtraClaws(), чтобы программа не заканчивалась с ошибкой ArrayIndexOutOfBoundsException.
 * Номер каждой лапы (paw) должен начинаться с 1 и заканчиваться 4. В каждой лапе количество когтей (claws) должно быть увеличено на два.
 * Пример вывода на экран: "Paw 1 is ready with 7 claws".
 * Исправить код метода fireExceptionRockets(), чтобы тот вместо вывода на экран текста ошибки выводил ее StackTrace.
 * Пример:
 * java.lang.Exception: Whatcha gonna do now!?
 * at ru.rush.task.pro.task14.task1421.Catzilla.<init>(Catzilla.java:9)
 * at ru.rush.task.pro.task14.task1421.Solution.main(Solution.java:6)
 * После всех исправлений и запуска программы последней строкой в консоли должен быть текст "Catzilla is ready for action.".
 *
 * Требования:
 * •	Не изменяй класс Solution.
 * •	Исправь код метода overclockReactor() класса Catzilla согласно условиям.
 * •	Исправь код метода enlargeFangs() класса Catzilla согласно условиям.
 * •	Исправь код метода generateExtraClaws() класса Catzilla согласно условиям.
 * •	Исправь код метода fireExceptionRockets() класса Catzilla согласно условиям.
 */
public class Solution {
    public static void main(String[] args) {
        Catzilla catzilla = new Catzilla();
        try {
            catzilla.overclockReactor();
            catzilla.enlargeFangs();
            catzilla.generateExtraClaws();
            catzilla.fireExceptionRockets();
            System.out.println("Catzilla is ready for action.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
