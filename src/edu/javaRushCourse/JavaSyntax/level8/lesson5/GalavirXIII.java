package edu.javaRushCourse.JavaSyntax.level8.lesson5;


public class GalavirXIII {
    public static int superWeapon = Integer.MAX_VALUE;
    public double health = Double.MAX_VALUE;

    public void defend(double damage) {
        health -= (superWeapon / damage);
    }

    public int attack() {
        return superWeapon;
    }
}
