package edu.javaCourse.lesson_15.classWork;

public class Clock2 {
    public static void main(String[] args) {
        for (int hour = 0; hour < 23; hour++) {
            int minutes = 0;
            while (minutes < 60) {
                System.out.println(hour + " : " + minutes);
                minutes++;
            }
        }
    }
}
