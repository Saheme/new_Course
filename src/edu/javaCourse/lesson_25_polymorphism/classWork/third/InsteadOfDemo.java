package edu.javaCourse.lesson_25_polymorphism.classWork.third;

public class InsteadOfDemo {
    public static void main(String[] args) {

        Employee emp1 = new Doctor();
        Employee emp2 = new Driver();
        Employee emp3 = new Teacher();
        Employee emp4 = new Employee();
       // Doctor d1 =(Doctor) emp1;
        System.out.println(((Doctor)emp1).specialization);
        HelpAble h = new Doctor();
        ((Doctor) h).treat();
        System.out.println("-------------------");

        Employee[] array = {emp1,emp2,  emp3,emp4};
        for (Employee line : array) {
            if (line instanceof Driver){
                System.out.println(((Driver)line).nameOfCar);
                ((Driver) line).drive();
            }
        }
    }
}

class Employee {
    String name;
    int age;
    int experience;
    double salary = 100;

    public void eat() {
        System.out.println("He's eating");
    }

    public void sleep() {
        System.out.println("He's sleeping ");
    }
}
class Doctor extends Employee implements HelpAble {
    String specialization = "surgery";
    public void treat() {
        System.out.println("He's treatment");
    }

    @Override
    public void help() {
        System.out.println("Doctor helps");
    }
}
class Driver extends Employee {
    String nameOfCar = "BMW";

    public void drive() {
        System.out.println("He's driving");
    }
}
class Teacher extends Employee {
    String extendExperience;

    public void teach() {
        System.out.println("He's working");
    }

}
interface HelpAble {
    void help();
}

