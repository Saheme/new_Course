package edu.javaCourse.lesson_5.classWork.second;

public class Car1 {
    String color;
    String engine;
    int speed;

    public int increaseSpeed(int increase) {
        return speed += increase;
    }

    public int decreaseSpeed(int decrease) {
        return speed -= decrease;
    }

    public void showInfo() {
        System.out.println("машина  цвета - " + color + " ,с двигателем " + engine + " ,едет со скоростью - " + speed);
    }

}
