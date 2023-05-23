package edu.javaRushCourse.JavaSyntax.level4.lesson4;

/**
 * Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3. Для этого используй цикл while.
 * <p>
 * Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.
 * <p>
 * Требования:
 * •	Программа должна вывести в консоль сумму всех чисел от 1 до 100 включительно, не кратных 3.
 * •	В программе необходимо использовать цикл while.
 * •	В программе необходимо использовать оператор continue.
 */
public class Task60 {
    public static void main(String[] args) {
        int i = 0;
        int sum=0;
        while (i < 100) {
            i++;
            if (i % 3 == 0) {
                continue;
            } else
                sum+=i;
        }
        System.out.print(sum );
    }
}
