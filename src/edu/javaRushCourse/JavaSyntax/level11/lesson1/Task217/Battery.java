package edu.javaRushCourse.JavaSyntax.level11.lesson1.Task217;

import java.util.Random;

public class Battery {
    private int charge = new Random().nextInt(90) + 1;

    private Battery() {
    }

    public static Battery[] getBatteries() {
        Battery[] batteries = new Battery[100500];
        for (int i = 0; i < batteries.length; i++) {
            batteries[i] = new Battery();
        }
        return batteries;
    }

    public int use() {
        int charge = this.charge;
        this.charge = 0;
        return charge;
    }
}
