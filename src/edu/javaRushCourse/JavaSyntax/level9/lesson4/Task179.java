package edu.javaRushCourse.JavaSyntax.level9.lesson4;

/**
 * В классе Solution реализуй метод printNumbers(), который выводит числа от 1 до 10 включительно с паузой между выводом каждого числа — 1,3 миллисекунды.
 * В этом тебе поможет метод sleep(long, int) класса Thread, который должен сработать 9 раз.
 *
 * Требования:
 * •	Реализуй метод printNumbers() согласно условию.
 */
public class Task179 {
    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }

    public static void printNumbers() throws InterruptedException {
        int count =0;
        for (int i = 1; i <=10; i++) {
            System.out.println(i + " " + count);
            Thread.sleep(1);

        }
    }
}
