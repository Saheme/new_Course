package edu.javaRushCourse.JavaSyntax.level13.lesson1.Task274;

public class TransportShip {
    public Integer speed;
    public Integer acceleration;
    public Passenger[] passengers;
    public OnBoardSystem onBoardSystem = new OnBoardSystem();

    public class OnBoardSystem {
        public Integer calculateJumpTime(Integer distance) {

            return (int) (Math.sqrt((speed * speed) + (2 * distance) * acceleration) - speed) / acceleration;
        }
    }
}
