package edu.javaCourse.lesson_23_overriding.homeWork.first.p2;

import edu.javaCourse.lesson_23_overriding.homeWork.first.p1.X;

/**
 * не скомпилируется т.к вконструктор суперкласса вуащде и не виден в другом пакете
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
