package edu.javaCourse.lesson_23_overriding.homeWork.fourth;

/**
 * не скомпилируется. Параметры метода не понятно какого типа
 */
public class Test {
    public static void abc(X x, Y y){
        System.out.println("privet");
    }
    public static void abc(Y y, X x){
        System.out.println("poka");
    }

    public static void main(String[] args) {
        Y y =new Y();
        //abc(a,a);
    }
}
