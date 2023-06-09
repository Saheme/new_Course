package edu.javaRushCourse.JavaSyntax.level9.lesson2.Task175;

import java.util.Random;

import java.util.Random;
import static edu.javaRushCourse.JavaSyntax.level9.lesson2.Task175.CosmicAnomaly.*;

/**
 * С помощью псевдослучайных чисел нужно подобрать правильное число, иначе корабль будет навеки потерян в космической аномалии.
 *
 * Класс CosmicAnomaly содержит верхнюю и нижнюю границу, в которых содержится правильное число, которое нужно угадать.
 * Эти границы можно использовать для генерации случайного числа, которое затем нужно передать в метод nextAttempt() класса CosmicAnomaly.
 *
 * Если попытка была неудачной, то надо воспользоваться обновленными значениями границ (lowerBound и upperBound),
 * чтобы сгенерировать новое случайное число, и повторить попытку. Скорее всего, тебе придется делать это в цикле.
 *
 * Если число было угадано, то метод nextAttempt() вернет то же самое число, которое в него передали.
 * Тогда программу можно завершить, Амиго и Диего спасены!
 *
 * Требования:
 * •	Класс CosmicAnomaly изменять нельзя.
 * •	Метод main() должен вызывать метод nextAttempt() до тех пор, пока тот не вернет то же число, с которым его вызвали.
 * •	Подобрать правильное число нужно менее чем за 30 попыток.
 */
public class Task175 {
    public static void main(String[] args) {

        Random random = new Random();
        for (int i = 0; i < 29; i++) {
            int x = random.nextInt(upperBound - lowerBound) + lowerBound;
            int n = nextAttempt(x);
            if (x == n)
                break;
        }
    }

}


