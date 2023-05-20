package edu.javaCourse.lesson_22.encapsulation.homeWork.first;

public class Student {
    private StringBuilder name = new StringBuilder();
    private int course;
    private int grade;


    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course < 5) {
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade < 11) {
            this.grade = grade;
        }
    }

    public void showInfo() {
        System.out.println("Name of student : " + getName() + " His course of university  is : " + getCourse() + " His grade is : " + getGrade());
    }
}
