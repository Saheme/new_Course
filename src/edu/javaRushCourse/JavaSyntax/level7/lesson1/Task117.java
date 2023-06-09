package edu.javaRushCourse.JavaSyntax.level7.lesson1;

/**
 * К Амиго из болота лезут упыри и скелеты. Нужно с помощью метода (функции) активировать его меч, и тогда Амиго легко уничтожает скелетов и упырей.
 *
 * Создай метод activateSword(), вынеси в этот метод вывод на экран фразы "Амиго активирует меч и легко уничтожает скелетов и упырей."
 * Вызови метод activateSword() в нужном месте метода main. Остальной код метода main не изменяй.
 *
 * Требования:
 * •	В классе Solution должен быть создан public static void метод activateSword().
 * •	Вызов метода activateSword должен выводить в консоль фразу "Амиго активирует меч и легко уничтожает скелетов и упырей.".
 * •	В методе main должен быть вызван метод activateSword в нужном месте. Остальной код метода main изменять нельзя.
 */
public class Task117 {
    public static void main(String[] args) {
        System.out.println("Из болота лезут упыри и скелеты...");

        activateSword();
    }

   public static void activateSword(){
       System.out.println("Амиго активирует меч и легко уничтожает скелетов и упырей.");
    }
}


