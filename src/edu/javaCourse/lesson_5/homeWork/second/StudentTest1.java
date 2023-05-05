package edu.javaCourse.lesson_5.homeWork.second;

import edu.javaCourse.lesson_5.homeWork.second.Student1;

public class StudentTest1 {
    public static void main(String[] args) {
        Student1 student1 = new Student1(1,"Aleksey","Ivanov",1,3,3,3);
        double averageGradeSt1 = student1.averageGrade(student1);
        System.out.println("студент " + student1.firstName + " " + student1.lastName + " с id : " + student1.studentId + " , " + student1.academicLevel + " " +
                "курса , имеет следующую среднюю оценку по предметам - " + averageGradeSt1);
        System.out.println("-----------");

        Student1 student2 = new Student1(2,"Andrey","Petrov",4,4,4,4);
        double averageGradeSt2 = student2.averageGrade(student2);
        System.out.println("студент " + student2.firstName + " " + student2.lastName + " с id : " + student2.studentId + " , " + student2.academicLevel + " " +
                "курса , имеет следующую среднюю оценку по предметам - " + averageGradeSt2);
        System.out.println("-----------");

        Student1 student3 = new Student1(3,"Ivan","Smirnov",3,5,5,5);

        double averageGradeSt3 = student3.averageGrade(student3);
        System.out.println("студент " + student3.firstName + " " + student3.lastName + " с id : " + student3.studentId + " , " + student3.academicLevel + " " +
                "курса , имеет следующую среднюю оценку по предметам - " + averageGradeSt3);
    }
}
