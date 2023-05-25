package edu.javaCourse.lesson_25_polymorphism.classWork.first;

public class DemoPolimorph1 {
    public static void main(String[] args) {

        Driver[] array = {new Driver(), new Driver()};
        Employee[] array2 = {new Doctor(), new Teacher(), new Driver()};
        HelpAble[] array3 = {new Doctor(), new Teacher(), new Driver(), new Driver()};

        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();

        emp1.work();
        emp2.work();
        emp3.work();
        System.out.println();
        HelpAble h = new Teacher();
        h.help();
        emp1.help();
        emp2.help();
        emp3.help();

//        Employee[] array5 = {emp1,emp2,emp3};
//        for (Employee line : array5) {
//            System.out.print (line + " ");
//        }
        System.out.println(emp1 instanceof Driver);
    }


}

abstract class Employee implements HelpAble {
    void sleep() {
        System.out.println("Employee is sleeping");
    }

    abstract void work();
}

class Teacher extends Employee  {

    @Override
    public void help() {
        System.out.println("Teacher helps");
    }

    @Override
    void work() {
        System.out.println("Teacher is working");
    }
}

class Driver extends Employee implements HelpAble {

    @Override
    void work() {
        System.out.println("Driver is working");
    }

    @Override
    public void help() {
        System.out.println("Driver helps");
    }
}

class Doctor extends Employee implements HelpAble {

    @Override
    void work() {
        System.out.println("Doctor is working");
    }

    @Override
    public void help() {
        System.out.println("Doctor helps");
    }
}

interface HelpAble {
    void help();
}

