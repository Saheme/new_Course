package edu.javaCourse.lesson_5.homeWork.third;

public class Employee {
    int id;
    String surname;
    int age;
    String department;
    double salary;

    public Employee(int id, String surname, int age, String department, double salary) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public double increaseSalary() {
        return salary * 2;
    }
}
