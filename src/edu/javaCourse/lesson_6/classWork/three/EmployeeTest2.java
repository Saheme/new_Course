package edu.javaCourse.lesson_6.classWork.three;

public class EmployeeTest2 {
    public static void main(String[] args) {
        Employee2 emp = new Employee2(2, "Yorick", 28, "IT", 30000.0);
        Employee2 emp2 = new Employee2("Karakul", 33);
        System.out.println(emp.id + " " + emp.surname + " " + emp.age + " " + emp.department + " " + emp.salary);
        System.out.println(emp2.surname + " " + emp2.age);
    }
}
