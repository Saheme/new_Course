package edu.javaCourse.lesson_5.homeWork.third;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee empl1 = new Employee(1,"Yakov",23,"Management",3568.90);
        Employee empl2 = new Employee(1,"Petr",54,"Loworker",1869.50);
        System.out.println(empl1.increaseSalary());
        System.out.println(empl2.increaseSalary());
    }
}
