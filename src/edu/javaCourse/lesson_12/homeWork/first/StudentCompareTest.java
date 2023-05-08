package edu.javaCourse.lesson_12.homeWork.first;

public class StudentCompareTest {
    public static void main(String[] args) {
        Student st1 = new Student("Alex",4,1);
        Student st2 = new Student("Alex",1,12);
       st1.compareStudents(st1,st2);
       Student.compareFieldsStudents(st1,st2);

    }
}
