package edu.professionalJava.part9_IO_And_NIO.lesson7_Serialisation.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {
    static final long serialVersionUID =2;
    String name;
    String surname;
    String department;
    int age;
    transient int salary;

    Car car;

    public Employee(String name, String surname, String department, int age, int salary) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
       // this.car = car;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                "surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
               // ", car=" + car +
                '}';
    }
}
