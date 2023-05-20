package edu.javaCourse.lesson_23_overriding.classWork.first;

public class EmployeeDemo {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.name = "Boris";
        doctor.age = 50;
        doctor.experience = 25;
        doctor.eat();
        doctor.sleep();
        doctor.treat();

    }

    void increaseSalary(Employee emp) {
        emp.salary = emp.salary + 150;
    }
}
