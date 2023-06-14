package edu.javaRushCourse.JavaSyntax.level12.lesson5;

import java.util.Random;

/**
 * Компилятор космопорта сломан, чтобы начать погрузку транспорта, сначала нужно его починить.
 *
 * Нужно пройти по всей производственной цепочке робозомби и внести коррективы. Детальное ТЗ смотри ниже.
 *
 * Требования:
 * •	Все внутренние классы и все переменные в классе Cosmoport должны быть статическими.
 * •	Метод compile внутреннего класса Compiler должен устанавливать робозомби предназначение "Loader".
 * •	Метод produce внутреннего класса RoboZombieFactory должен передавать каждого нового зомби в метод compile переменной COMPILER.
 * •	Метод toString внутреннего класса RoboZombie должен возвращать строку, содержащую значение переменной destiny.
 * •	Метод main должен вывести в консоль всех робозомби из массива roboZombies.
 */
public class Cosmoport {
    public static Compiler COMPILER = new Compiler();
    public static RoboZombie[] roboZombies = Cosmoport.RoboZombieFactory.produce();

    public static void main(String[] args) {

        for (RoboZombie line: roboZombies) {
            System.out.println(line + " ");
        }
    }

    public static class Compiler {
        public void compile(RoboZombie roboZombie) {
            roboZombie.destiny = "Loader";
        }
    }

    public static class RoboZombieFactory {
        public static RoboZombie[] produce() {
            RoboZombie[] army = new RoboZombie[new Random().nextInt(100)];
            for (int i = 0; i < army.length; i++) {
                army[i] = new RoboZombie();
                Cosmoport.COMPILER.compile(army[i]);
            }

            return army;
        }
    }

    public static class RoboZombie {
        public String destiny;



        @Override
        public String toString() {
            return "RoboZombie{" +
                    "destiny='" + destiny + '\'' +
                    '}';
        }
    }
}
