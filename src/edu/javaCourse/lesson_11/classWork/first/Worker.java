package edu.javaCourse.lesson_11.classWork.first;

public class Worker {
    public String name;
    public double salary;

    public Worker() {
    }

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double increaseSalary(double salary) {

        return salary * 2;
    }
    public double increaseSalaryObj(){
        return salary *=2;
    }
}
