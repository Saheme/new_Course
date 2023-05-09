package edu.javaCourse.lesson_14.homeWork;

public class ClockDemo {
    public static void main(String[] args) {
        clock();
    }

    public static void clock() {
        OUTER:
        for (int hour = 0; hour <= 6; hour++) {
            INNER1:
            for (int minutes = 0; minutes < 60; minutes++) {
                if (hour > 1 &&   minutes % 10 == 0) {
                    break OUTER;
                }
                INNER2:
                for (int secunds = 0; secunds < 60; secunds++) {
                    if (secunds * hour > minutes) {
                        continue INNER1;
                    }
                    System.out.println(hour + " : " + minutes + " : " + secunds);
                }
            }
        }
    }
}

//&& (minutes % 10 == 0)    hour > 1