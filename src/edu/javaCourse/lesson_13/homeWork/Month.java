package edu.javaCourse.lesson_13.homeWork;

public class Month {
    public static void numberOfDays1(int numberOfMonth) {
        switch (numberOfMonth) {
            case 1 -> System.out.println("January - contain 31 days");
            case 2 -> System.out.println("February - consist 28 days");
            case 3 -> System.out.println("March - contain 31 days ");
            case 4 -> System.out.println("April - contain 30 days");
            case 5 -> System.out.println("May - contain 31 days");
            case 6 -> System.out.println("June - contain 30 days");
            case 7 -> System.out.println("July - contain 31 days");
            case 8 -> System.out.println("August - contain 31 days");
            case 9 -> System.out.println("September - contain 30 days");
            case 10 -> System.out.println("October - contain 31 days");
            case 11 -> System.out.println("November - contain 30 days");
            case 12 -> System.out.println("December - contain 31 days");
            default -> System.out.println("There isn't so month.");
        }
    }

    public static void numberOfDays2(int numberOfMonth) {
        switch (numberOfMonth) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("This month contain 31 days");
            case 4, 6, 9, 11 -> System.out.println("This month contain 30 days");
            case 2 -> System.out.println("This month contain 28 or 29 days");
            default -> System.out.println("There isn't so month.");
        }
    }
}
