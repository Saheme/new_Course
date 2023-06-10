package edu.javaRushCourse.JavaSyntax.level10.lesson3;

import java.util.Arrays;

public class Task205Answer {
    public static String[] piratesDB = new String[]{
            "Drax",
            "Yondu Udonta",
            "Maz Kanata",
            "キャプテン・ハーロック",
            "Star-Lord",
            "Christopher Summers",
            "Крысс",
            "Весельчак У",
            "Nebula",
            "Rocket",
            "Han Solo",
            "boba Fett"
    };

    public static void main(String[] args) {
        System.out.println(Arrays.toString(piratesDB));

        corruptDB();
        addTwoNames();

        System.out.println(Arrays.toString(piratesDB));
    }

    public static void corruptDB() {
        int counter = 0;
        for (int i = 0; i < piratesDB.length && counter < 2; i++) {
            if (piratesDB[i].contains("b")) {
                piratesDB[i] = piratesDB[i].replaceAll("b", "\b");
                counter++;
            }
        }
    }
    public static void addTwoNames() {
        int length = piratesDB.length;
        String[] newDB = new String[length + 2];
        System.arraycopy(piratesDB, 0, newDB, 0, length);
        newDB[length] = "Рыжий Амиго";
        newDB[length + 1] = "Одноглазый Диего";
        piratesDB = newDB;
    }
}
