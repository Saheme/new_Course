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
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Имена студентов курсы и оценки одинаковые");
                } else {
                    System.out.println("Имена студентов курсы одинаковые , оценки разные");
                }
            } else {
                System.out.println("Имена студентов одинаковые , курсы разные");
            }
        } else {
            System.out.println("Имена студентов разные");
        }
    }
}





