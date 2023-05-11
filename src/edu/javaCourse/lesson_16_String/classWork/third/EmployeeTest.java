package edu.javaCourse.lesson_16_String.classWork.third;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(1000.1,true);
        System.out.println(emp.isManager + " " +  emp.salary ); // boolean и double нельзя конкатенировать только разделяя их String
    }
}
