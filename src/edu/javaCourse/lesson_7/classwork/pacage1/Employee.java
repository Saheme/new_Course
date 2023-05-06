package edu.javaCourse.lesson_7.classwork.pacage1;

public class Employee {
     double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    void increaseSalary() {

        System.out.println("Зарплата = " + (salary * 2));
    }

    public static void main(String[] args) {
        Employee employee = new Employee(5000.0);
        employee.increaseSalary();
    }

}
