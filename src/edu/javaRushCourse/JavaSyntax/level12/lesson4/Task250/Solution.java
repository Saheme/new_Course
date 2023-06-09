package edu.javaRushCourse.JavaSyntax.level12.lesson4.Task250;

/**
 * Нужно победить во втором раунде МЕГАБАТТЛА, написав еще более мощный Ультраметал.
 *
 * Хороший Ультраметал действует на робозомби как антивирус — деинсталирует у них все баги.
 *
 * Но кроме видимых робозомби еще множество их шляется в помещениях космопорта, а так же стоит на складе.
 *
 * Сейчас они недоступны для Ультраметала, и чтобы до них достучаться, нужно воспользоваться силой внутренних статических классов.
 *
 * Требования:
 * •	Нельзя изменять классы RoboZombie, Cosmoport.Werehouse, Cosmoport.RoboZombieFactory.
 * •	Класс UltraMetal нужно перенсти внутрь класса Cosmoport и сделать его статическим.
 * •	Метод main должен вызывать метод play класса Cosmoport.UltraMetal.
 * •	Метод play должен вызывать метод uninstallBugs у всех робозомби из Solution.roboZombies, Cosmoport.roboZombies, Cosmoport.Werehouse.roboZombies.
 */
public class Solution {
    public static RoboZombie[] roboZombies = Cosmoport.RoboZombieFactory.produce();

    public static void main(String[] args) {
        Cosmoport.UltraMetal.play();
    }
}
