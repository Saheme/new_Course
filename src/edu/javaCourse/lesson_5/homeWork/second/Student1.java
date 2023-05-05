package edu.javaCourse.lesson_5.homeWork.second;

public class Student1 {
    int studentId;
    String firstName;
    String lastName;
    int academicLevel; //год обучения
    double averageGradeInMath;
    double averageGradeInEconomy;
    double averageGradeInForeignLanguage;

    public double averageGrade (double avMath , double avEcon, double avForLen){
        return (avMath+avEcon+avForLen)/3;
    }


}
