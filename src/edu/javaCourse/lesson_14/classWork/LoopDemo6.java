package edu.javaCourse.lesson_14.classWork;

public class LoopDemo6 {
    public static void main(String[] args) {
        clock();

    }

    public static void clock() {
        OUTER: for (int hour = 0; hour < 24; hour++) {

            INNER: for (int minute = 0; minute < 60; minute++) {
                System.out.println(hour + " : " + minute);
                if (minute==30){
                    break INNER;
                }

            }
        }
    }

}
