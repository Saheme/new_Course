package edu.javaCourse.lesson_7.homework;

public class EmployeeTest3 {
    public static void main(String[] args) {
        Employee3 emp = new Employee3(5,"Vasy",25.5);
        emp.showId();
        emp.showSalary();
        emp.showSurname();
        System.out.println("---------------");
        Employee3 emp2 = new Employee3("Katy",35.7);
        emp2.showId();
        emp2.showSalary();
        emp2.showSurname();
    }
}
