package edu.javaCourse.lesson_4.homework;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.firstName = "Aleksey";
        student1.lastName = "Ivanov";
        student1.studentId = 1;
        student1.academicLevel = 3;
        student1.averageGradeInMath = 4.7;
        student1.averageGradeInEconomy = 5.0;
        student1.averageGradeInForeignLanguage = 3.1;
        double averageGradeSt1 = (student1.averageGradeInMath + student1.averageGradeInEconomy + student1.averageGradeInForeignLanguage) / 3;
        System.out.println("студент " + student1.firstName + " " + student1.lastName + " с id : " + student1.studentId + " , " + student1.academicLevel + " " +
                "курса , имеет следующую среднюю оценку по предметам - " + averageGradeSt1);
        System.out.println("-----------");

        Student student2 = new Student();
        student2.firstName = "Andrey";
        student2.lastName = "Petrov";
        student2.studentId = 2;
        student2.academicLevel = 1;
        student2.averageGradeInMath = 4.1;
        student2.averageGradeInEconomy = 3.6;
        student2.averageGradeInForeignLanguage = 3.2;
        double averageGradeSt2 = (student2.averageGradeInMath + student2.averageGradeInEconomy + student2.averageGradeInForeignLanguage) / 3;
        System.out.println("студент " + student2.firstName + " " + student2.lastName + " с id : " + student2.studentId + " , " + student2.academicLevel + " " +
                "курса , имеет следующую среднюю оценку по предметам - " + averageGradeSt2);
        System.out.println("-----------");

        Student student3 = new Student();
        student3.firstName = "Ivan";
        student3.lastName = "Smirnov";
        student3.studentId = 3;
        student3.academicLevel = 4;
        student3.averageGradeInMath = 3.6;
        student3.averageGradeInEconomy = 3.8;
        student3.averageGradeInForeignLanguage = 4.6;
        double averageGradeSt3 = (student3.averageGradeInMath + student3.averageGradeInEconomy + student3.averageGradeInForeignLanguage) / 3;
        System.out.println("студент " + student3.firstName + " " + student3.lastName + " с id : " + student3.studentId + " , " + student3.academicLevel + " " +
                "курса , имеет следующую среднюю оценку по предметам - " + averageGradeSt3);
    }
}
