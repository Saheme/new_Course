package edu.javaRushCourse.JavaSyntax.level9.lesson6;

/**
 * Реализуй метод getPowerOfTwo(int power), который возвращает число 2 в степени power.
 * Тебе нужно изменить реализацию метода getPowerOfTwo(int), используя соответствующий побитовый сдвиг.
 * <p>
 * Требования:
 * •	В методе getPowerOfTwo(int) необходимо возвращать степень двойки.
 * •	В методе getPowerOfTwo(int) должен использоваться оператор побитового сдвига влево.
 */
public class Task185 {
    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(3));
    }

    public static int getPowerOfTwo(int power) {

        return 2 << power-1;
    }
}
