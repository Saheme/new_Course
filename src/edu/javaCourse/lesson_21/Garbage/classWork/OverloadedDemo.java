package edu.javaCourse.lesson_21.Garbage.classWork;

public class OverloadedDemo {
    public void abs (String s){
        System.out.println(s);
    }

    private StringBuilder abs (StringBuilder sb){
        System.out.println(sb);
        return new StringBuilder("Bye ! ");
    }
}
