package edu.javaCourse.lesson_5.homeWork.second;

public class Student1 {
    int studentId;
    String firstName;
    String lastName;
    int academicLevel; //год обучения
    double averageGradeInMath;
    double averageGradeInEconomy;
    double averageGradeInForeignLanguage;

    public Student1(int studentId, String firstName, String lastName, int academicLevel, double averageGradeInMath, double averageGradeInEconomy, double averageGradeInForeignLanguage) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.academicLevel = academicLevel;
        this.averageGradeInMath = averageGradeInMath;
        this.averageGradeInEconomy = averageGradeInEconomy;
        this.averageGradeInForeignLanguage = averageGradeInForeignLanguage;
    }

    public double averageGrade (Student1 student){
        return (averageGradeInMath+averageGradeInEconomy+averageGradeInForeignLanguage)/3;
    }


}
