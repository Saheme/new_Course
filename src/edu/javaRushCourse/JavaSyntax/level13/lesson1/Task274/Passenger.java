package edu.javaRushCourse.JavaSyntax.level13.lesson1.Task274;

public class Passenger {
    public String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void jump(Integer delay) {
        System.out.printf("%s выжидает %d секунд... и прыгает!\n", name, delay);
    }
}
