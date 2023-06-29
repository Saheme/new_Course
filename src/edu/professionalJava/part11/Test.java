package edu.professionalJava.part11;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
       Days days = new Days(WeekDays.FRIDAY);
       days.daysInfo();
       WeekDays w1 = WeekDays.MONDAY;
       WeekDays w2 = WeekDays.MONDAY;
       WeekDays w3= WeekDays.SUNDAY;
        System.out.println(w1==w2);
        System.out.println(WeekDays.MONDAY.equals(WeekDays2.MONDAY));

        WeekDays w10 = WeekDays.valueOf("MONDAY");
        System.out.println(w10);

        WeekDays[]array = WeekDays.values();
        System.out.println(Arrays.toString(array));
    }
}

enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("good"),
    THURSDAY("good"),
    FRIDAY("great"),
    SATURDAY("wonderful"),
    SUNDAY("good");

    private String mood;

    WeekDays(String mood) {
        this.mood = mood;
    }

    public String getMood(){
        return mood;
    }
}
enum WeekDays2 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}
class Days{
    WeekDays weekDays;

    public Days(WeekDays weekDays) {
        this.weekDays = weekDays;
    }


    void daysInfo(){
        switch (weekDays){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("You have to go for a work!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("You can relax.");
        }
        System.out.println("My mood today is : " + weekDays.getMood());
    }
}
