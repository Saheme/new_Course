package edu.javaCourse.lesson_6.homeWork.second;

import edu.javaCourse.lesson_5.homeWork.second.Student1;

public class Student2 {

    int studentId;
    String firstName;
    String lastName;
    int academicLevel; //год обучения
    double averageGradeInMath;
    double averageGradeInEconomy;
    double averageGradeInForeignLanguage;

    public Student2(int studentId, String firstName, String lastName, int academicLevel, double averageGradeInMath, double averageGradeInEconomy, double averageGradeInForeignLanguage) {
      this(studentId,firstName,lastName,academicLevel);
      this.averageGradeInMath = averageGradeInMath;
      this.averageGradeInEconomy = averageGradeInEconomy;
      this.averageGradeInForeignLanguage = averageGradeInForeignLanguage;
    }

    public Student2() {
    }

    public Student2(int studentId, String firstName, String lastName, int academicLevel) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.academicLevel = academicLevel;
    }



}
