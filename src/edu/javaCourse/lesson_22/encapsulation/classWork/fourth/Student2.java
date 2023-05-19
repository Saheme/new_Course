package edu.javaCourse.lesson_22.encapsulation.classWork.fourth;

public class Student2 extends Human2 {

    public Student2(String name, String surname) {
        super(name, surname);
    }

    public static void main(String[] args) {
        Student2 st = new Student2("Alex", "Rojkov");
        System.out.println(st.name + " " + st.surname);
    }
}
