package edu.javaRushCourse.JavaSyntax.level12.lesson2.Task242;

public class UltraMetal {
    public void playUltraMetal(String one, String two, String three) {
        int counter = 0;
        try {
            while (counter < 3) {
                System.out.print(one);
                Thread.sleep(500);
                System.out.print(two);
                Thread.sleep(500);
                System.out.println(three);
                Thread.sleep(1000);
                counter++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
