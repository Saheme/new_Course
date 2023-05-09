package edu.javaCourse.lesson_14.classWork;

public class loopDemo5 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i == 10 ) {
                continue;
            } else if (i==20) {
                break;
            }
            System.out.print(i + " ");
        }
    }
}
