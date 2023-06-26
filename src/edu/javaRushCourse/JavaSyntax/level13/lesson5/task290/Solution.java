package edu.javaRushCourse.JavaSyntax.level13.lesson5.task290;

import edu.javaRushCourse.JavaSyntax.level13.lesson4.task286.Core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Твоя задача:
 * <p>
 * В классе Solution создать список rescuedRobots.
 * В классе Solution создать метод rescueRobots() для поиска роботов Amigo и Diego и последующего добавления их в список rescuedRobots.
 * Этот же метод должен удалить Amigo и Diego из списка cableContents.
 * В методе main() вызвать методы rescueRobots(), emptyGarbageBin() и printList().
 * Требования:
 * •	Нельзя изменять класс Robot.
 * •	Нельзя изменять список cableContents и методы emptyGarbageBin()/printList() класса Solution.
 * •	В классе Solution должен быть создан и инициализирован (пустой) private static список роботов (List<Robot>) с именем rescuedRobots.
 * •	Метод rescueRobots() должен пройтись по списку cableContents, найти роботов Amigo и Diego, и добавить их в список rescuedRobots.
 * •	Метод rescueRobots() должен удалить роботов Amigo и Diego из списка cableContents.
 * •	Метод main должен вызвать методы rescueRobots(), emptyGarbageBin() и printList(), по одному разу, в этом же порядке.
 */
public class Solution {
    public static List<Robot> cableContents = new ArrayList<>(Arrays.asList(new Robot("T1000"), new Robot("Amigo"),
            new Robot("B1"), new Robot("Diego"), new Robot("Zed")));
    private static List<Robot> rescuedRobots = new ArrayList<>();

    public static void main(String[] args) {
        rescueRobots();
        emptyGarbageBin();
        printList(rescuedRobots);
    }

    public static void rescueRobots() {
        if (cableContents.contains(new Robot("Amigo")) && cableContents.contains(new Robot("Diego"))) {
            rescuedRobots.add(new Robot("Amigo"));
            rescuedRobots.add(new Robot("Diego"));
            cableContents.remove(new Robot("Amigo"));
            cableContents.remove(new Robot("Diego"));
        }
    }


    private static void emptyGarbageBin() {
        cableContents.clear();
        System.out.println("Garbage cleared");
    }

    public static void printList(List<Robot> list) {
        for (Robot o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}

//if (cableContents.get(i).equals(new Robot("Diego"))&&cableContents.get(i).equals(new Robot("Amigo")))