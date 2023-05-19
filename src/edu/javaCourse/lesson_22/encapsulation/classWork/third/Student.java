package edu.javaCourse.lesson_22.encapsulation.classWork.third;

public class Student extends Human{
    public static void main(String[] args) {
        Student stud =new Student();
        System.out.println(stud.name);
       System.out.println(Student.salary);
        stud.work();
        Student.rest();
    }
}
