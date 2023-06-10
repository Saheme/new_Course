package edu.javaRushCourse.JavaSyntax.level10.lesson4.Task206;

import static edu.javaRushCourse.JavaSyntax.level10.lesson4.Task206.CaptainBridge.checkAccess;
import static edu.javaRushCourse.JavaSyntax.level10.lesson4.Task206.CaptainBridge.debugAccess;

public class Task206Answer {
    public static void main(String[] args) {
        String rank = "";
        if (debugAccess("Раб")) {
            rank = "Раб";
        } else if (debugAccess("Гость")) {
            rank = "Гость";
        } else if (debugAccess("Боец")) {
            rank = "Боец";
        } else if (debugAccess("Ветеран")) {
            rank = "Ветеран";
        } else if (debugAccess("Картографист")) {
            rank = "Картографист";
        } else if (debugAccess("Капитан")) {
            rank = "Капитан";
        } else if (debugAccess("Стив")) {
            rank = "Стив";
        }

        checkAccess(rank);
    }
}
