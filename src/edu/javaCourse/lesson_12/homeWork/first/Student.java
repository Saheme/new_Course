package edu.javaCourse.lesson_12.homeWork.first;

public class Student {

    String name;
    int course;
    double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public void compareStudents(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.grade == st2.grade && st1.course == st2.course) {
            System.out.println("Students equals");
        } else {
            System.out.println("Students arent equals");
        }
    }

    public static void compareFieldsStudents(Student st1, Student st2) {
        if (st1.name == st2.name) {
            if (st1.course > st2.course) {
                if (st1.grade > st2.grade) {
                    System.out.println("Курс выше , оценки выше у первого студента");
                } else {
                    System.out.println("Курс выше , оценки хуже у первого студента");
                }
            } else {
                System.out.println("Курс младше у первого студента");
            }
        } else {
            System.out.println("У них разные фамилии");
        }
    }
}





