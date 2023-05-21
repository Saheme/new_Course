package edu.javaCourse.lesson_23_overriding.homeWork.first.p2;

import edu.javaCourse.lesson_23_overriding.homeWork.first.p1.X;

/**
 * Y
 */
public class Y extends X {
    public Y(){
    }

    public void abc(){
        System.out.println('Y');
    }

    public static void main(String[] args) {
        Y y= new Y();
        y.abc();
    }
}
