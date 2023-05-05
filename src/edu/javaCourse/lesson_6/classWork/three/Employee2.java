package edu.javaCourse.lesson_6.classWork.three;

public class Employee2 {
    int id;
    String surname;
    int age;
    String department;
    double salary;

    public Employee2(int id, String surname, int age, String department, double salary) {
        this(id,surname,age);
        this.department = department;
        this.salary = salary;
    }

    public Employee2(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    public Employee2(int id, String surname, int age) {
        this(surname,age);
        this.id =id;
    }
}
