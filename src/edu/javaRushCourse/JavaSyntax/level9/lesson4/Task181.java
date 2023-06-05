package edu.javaRushCourse.JavaSyntax.level9.lesson4;

/**
 * Искажения времени не прошли бесследно: в робомозгу Диего образовалась каша. Разбираясь в причинах, мы обнаружили код сомнительного качества в модуле пауз.
 * <p>
 * Тебе нужно переписать тело метода pause():
 * <p>
 * Если входящий аргумент timeUnits меньше нуля, нужно сделать его положительным, например, умножив на -1.
 * Если после этого timeUnits оказался больше 999999, то нужно делить его на 10 до тех пор, пока он не станет меньше либо равен 999999.
 * После этих проверок и преобразований нужно вызвать метод Thread.sleep() с двумя аргументами, первым аргументом передать 0, а вторым — получившийся timeUnits.
 * Требования:
 * •	В методе pause() должен один раз вызываться метод Thread.sleep() с двумя параметрами.
 * •	В метод Thread.sleep() не должен передаваться отрицательный аргумент.
 * •	В метод Thread.sleep() не должен передаваться аргумент больше чем 999999.
 * •	Метод Thread.sleep() должен вызываться с двумя аргументами согласно условию.
 */
public class Task181 {
    public static void main(String[] args) throws InterruptedException {
        pause(1000L);
        pause(-1000L);
        pause(1234567L);
        pause(-9876543L);
        pause(0L);
    }

    public static void pause(long timeUnits) throws InterruptedException {
        if (timeUnits < 0) {
            timeUnits = Math.abs(timeUnits);
        } else if (timeUnits > 999999) {
            for (int i = 0; i < timeUnits; i++) {
                timeUnits /= 10;
                if (timeUnits <= 999999) {
                    break;
                }
            }
            Thread.sleep(0, (int) timeUnits);

//        if (timeUnits <= Integer.MAX_VALUE) {
//            Thread.sleep(0, (int) timeUnits);
//        } else {
//            Thread.sleep(timeUnits);
//        }
        }
    }
}
