package edu.javaRushCourse.JavaSyntax.level13.lesson1.Task274;

/**
 * Корабль друзей падает на поверхность орбитального кольца с ускорением.
 * Нужно запрограммировать прыжок Амиго и Диего в последний момент так, чтобы они не разбились при посадке.
 *
 * Реализуй метод calculateJumpTime в бортовой системе корабля. Метод получает на вход расстояние до поверхности в метрах.
 *
 * Метод должен рассчитать время в секундах, через которое нужно выпрыгнуть до того, как корабль врежется в поверхность.
 * При этом время должно быть максимально возможным, чтобы не прыгнуть слишком рано.
 *
 * Для расчетов используй текущую скорость (speed, м/с) и ускорение (acceleration, м/с2) корабля.
 *
 * Требования:
 * •	Метод calculateJumpTime должен возвращать время в секундах до столкновения с орбитальным кольцом.
 * •	Время возвращенное методом calculateJumpTime должно быть максимально возможным.
 * •	Для расчета времени метод calculateJumpTime должен использовать переменные distance, speed, acceleration.
 */
public class Solution {
    public static TransportShip ship;

    static {
        ship = new TransportShip();
        ship.speed = 1000;
        ship.acceleration = 500;
        ship.passengers = new Passenger[]{new Passenger("Диего"), new Passenger("Амиго")};
    }

    public static void main(String[] args) {
        Integer delay = ship.onBoardSystem.calculateJumpTime(12345);
        for (Passenger passenger : ship.passengers) {
            passenger.jump(delay);
        }
    }
}
