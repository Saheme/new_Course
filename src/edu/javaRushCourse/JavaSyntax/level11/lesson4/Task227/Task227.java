package edu.javaRushCourse.JavaSyntax.level11.lesson4.Task227;

/**
 * Для доступа к ретранслятору требуется изменить его траекторию и частоту для коммуникаций.
 *
 * Для этого нужно:
 *
 * В классе Repeater создать геттеры и сеттеры для переменных trajectory и frequency.
 * В методе main класса Solution создать объект класса Repeater.
 * В методе main класса Solution установить частоту ретранслятора, превышающую текущую в 10 раз, если текущая частота меньше 100.
 * В методе main класса Solution установить траекторию ретранслятора на "elliptic", если она таковой не является в данный момент.
 * Требования:
 * •	Не изменяй переменные trajectory и frequency и их инициализацию в классе Repeater.
 * •	Класс Repeater должен содержать геттер для переменной trajectory.
 * •	Класс Repeater должен содержать сеттер для переменной trajectory.
 * •	Класс Repeater должен содержать геттер для переменной frequency.
 * •	Класс Repeater должен содержать сеттер для переменной frequency.
 * •	Частота ретранслятора должна увеличиваться согласно условиям.
 * •	Траектория ретранслятора должна изменяться согласно условиям.
 */
public class Task227 {
    public static void main(String[] args) {
        Repeater repeater = new Repeater();
        if (repeater.getFrequency()<100)
          repeater.setFrequency(repeater.getFrequency()*10);
        repeater.setTrajectory("elliptic");


    }
}
