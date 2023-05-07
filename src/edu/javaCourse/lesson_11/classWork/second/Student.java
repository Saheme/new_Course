package edu.javaCourse.lesson_11.classWork.second;

public class Student {
    String name;
    int course;
    double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static   void changeLinks(Student student1, Student student2){

        Student student3 = student1;
        student1 = student2;
        student2 = student3;
    }

    public static void changeName(Student student){
        student.name = "Alex";
    }

}
