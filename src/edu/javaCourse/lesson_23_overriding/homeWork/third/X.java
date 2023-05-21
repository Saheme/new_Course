package edu.javaCourse.lesson_23_overriding.homeWork.third;

/**
 * ничего
 * ошибся , будет X 18
 * false (метод  хоть он и private но находится в том же классе и поэтому виден
 */
public class X {
    public X(){
        System.out.println("X");
    }
    public X(int i){
        System.out.println("X " + i);
    }
    private boolean abc(){
        return false;
    }

    public static void main(String[] args) {
        X x = new X(18);
        System.out.println(x.abc());
    }

}
