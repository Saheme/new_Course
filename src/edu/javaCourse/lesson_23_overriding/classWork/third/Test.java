package edu.javaCourse.lesson_23_overriding.classWork.third;

public class Test {
    void abs(Animal a){
        System.out.println("A");
    }
    void abs(Mouse m){
        System.out.println("M");

    }

    public static void main(String[] args) {
        Test test = new Test();
        Animal an = new Mouse();
        test.abs(an);

    }
}
