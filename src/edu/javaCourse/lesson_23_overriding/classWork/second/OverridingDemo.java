package edu.javaCourse.lesson_23_overriding.classWork.second;

import edu.javaCourse.lesson_23_overriding.classWork.first.Employee;

public class OverridingDemo {
    public static void main(String[] args) {
        Employee3 employee3 = new Employee3();
        Teacher3 teacher = new Teacher3();
        employee3.eat();
        teacher.eat();
        Employee3 e = new Employee3();
        e.eat();


    }
}
