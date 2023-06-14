package edu.javaRushCourse.JavaSyntax.level12.lesson2.Task241;

public class Robot {
    public static int robotCounter;

    public  int id;

    public  String model;

    public  int productionYear;

    public static String vendor = "Javarush Co.";

    public Robot(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
        id = ++robotCounter;
    }

    public void displayInformation() {
        System.out.printf("Я %d-й из %d роботов. Модель: %s. Произведен компанией %s в %d году.\n",
                id, robotCounter, model, vendor, productionYear);
    }
}
