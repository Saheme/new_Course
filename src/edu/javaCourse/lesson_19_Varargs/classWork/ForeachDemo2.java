package edu.javaCourse.lesson_19_Varargs.classWork;

public class ForeachDemo2 {
    public static void main(String[] args) {
        String[] students = {"Ivanov","Petrov","Sidorov" };
        String[] exams = {"Math-analise","Philosophy","Foreign -language" };

        for (String name : students) {
            for (String subject: exams) {
                System.out.println(name + " " + subject);
            }
        }
    }
}
