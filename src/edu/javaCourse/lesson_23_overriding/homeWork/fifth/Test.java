package edu.javaCourse.lesson_23_overriding.homeWork.fifth;

/**
 * не скомпилируется, тип x не может пользовать переменные Y
 */
public class Test {
    public static void main(String[] args) {
        X x = new Y();
       // System.out.println(x.s1 + " " + x.bool);
    }
}
