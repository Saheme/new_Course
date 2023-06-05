package edu.javaRushCourse.JavaSyntax.level9.lesson4;

import java.util.concurrent.TimeUnit;

/**
 * В классе Solution реализуй метод setTimer(int, int, int, int, int), который засыпает на определенное время, используя соответствующие методы java.util.concurrent.TimeUnit.
 * <p>
 * Требования:
 * •	Метод setTimer(int, int, int, int, int) должен быть реализован согласно условию.
 */
public class Task180 {
    public static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        System.out.println("Таймер запущен!");
        TimeUnit.HOURS.sleep(days * 24L);
        TimeUnit.HOURS.sleep(hours);
        TimeUnit.MINUTES.sleep(minutes);
        TimeUnit.SECONDS.sleep(seconds);
        TimeUnit.MILLISECONDS.sleep(millis);
        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
    }
}
