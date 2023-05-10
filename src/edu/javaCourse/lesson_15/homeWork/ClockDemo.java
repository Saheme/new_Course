package edu.javaCourse.lesson_15.homeWork;

public class ClockDemo {
   public static void clock(){
        int hour = 0;
        OUTER:
        while (hour < 6) {
            int minutes = -1;
            MIDDLE:
            do {
                int secunds = 0;
                minutes++;
                if (hour > 1 && minutes % 10 == 0) {
                    break OUTER;
                }
                while (secunds < 60) {
                    if (secunds * hour > minutes) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + " : " + minutes + " : " + secunds);
                    secunds++;
                }


            } while (minutes < 59);
            hour++;
        }
    }
}

