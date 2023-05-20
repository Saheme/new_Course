package edu.javaCourse.lesson_23_overriding.classWork.first;

public class EmployeeDemo {
    public static void main(String[] args) {
//        Doctor doctor = new Doctor();
//        Teacher teacher =new Teacher();
//        Driver driver = new Driver();
//        Employee employee = new Employee();

        Employee emp1 = new Doctor();
        System.out.println(emp1.age);
        System.out.println(emp1.name);
        System.out.println(emp1.salary);
        emp1.eat();
        emp1.sleep();

        Employee emp2 =new Teacher();
        Employee emp3 = new Driver();

        Doctor doc1 = new Surgery();
        Doctor doc2 = new Dentist();

        Employee emp4 = new Surgery();

        Employee emp5 = new Dentist();


    }


}


   /*  doctor.name = "Boris";
        doctor.age = 50;
        doctor.experience = 25;
        doctor.eat();
        doctor.sleep();
        doctor.treat();
*/