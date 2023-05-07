package edu.javaCourse.lesson_11.classWork.second;

import edu.javaCourse.lesson_5.homeWork.second.Student1;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Petrov", 2, 4.5);
        Student student2 = new Student("Ivanov", 4, 3.6);
        System.out.println("Первый студент по фамилии : " + student1.name + " " + student1.course + " курса" + " с оценкой : " + student1.grade);
        System.out.println("Второй студент по фамилии : " + student2.name + " " + student2.course + " курса" + " с оценкой : " + student2.grade);
        System.out.println("Меняем ссылки :");
       //Student.changeLinks(student1,student2);
        Student.changeName(student1);
        Student.changeName(student2);
        System.out.println("Первый студент по фамилии : " + student1.name + " " + student1.course + " курса" + " с оценкой : " + student1.grade);
        System.out.println("Второй студент по фамилии : " + student2.name + " " + student2.course + " курса" + " с оценкой : " + student2.grade);
    }
}
