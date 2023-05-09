package edu.javaCourse.lesspn_15.classWork;

public class ClockDemo {
    public static void main(String[] args) {
        int hour = 0;
        OUTER:
        do {
        int minutes = 0;
            INNER:
            while (minutes < 60){
                if (minutes==20){
                    continue  OUTER;
                }
            System.out.println(hour + " : " + minutes);
            minutes++;
            }
            hour++;
        }
        while (hour < 24);

    }
}
