package edu.javaCourse.lesson_23_overriding.homeWork.second.p2;

import edu.javaCourse.lesson_23_overriding.homeWork.second.p1.X;

/**
 * Y
 * Y
 * ghi() - не скомпилируется
 *
 */
public class Y extends X {
    public void abc(){
        System.out.println('Y');
    }
    public void def(){
    Y y = new Y();
    y.abc();
    }

//    public void ghi(){
//        X x =new Y();
//        x.abc();
//    }

    public static void main(String[] args) {
        Y a =new Y();
        a.abc();
        a.def();
       // a.ghi();
    }
}
