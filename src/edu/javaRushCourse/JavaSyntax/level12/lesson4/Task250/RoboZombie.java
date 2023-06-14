package edu.javaRushCourse.JavaSyntax.level12.lesson4.Task250;

public class RoboZombie {
    public void uninstallBugs() {
        String fullName = this.toString();
        String name = fullName.substring(fullName.lastIndexOf('.') + 1);
        System.out.println(name + " обеззаражен.");
    }
}
