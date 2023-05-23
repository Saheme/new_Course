package edu.javaCourse.lesson_24_interfase.classWork.interfaceDemo;

public class InterfaceDemo {
    public static void main(String[] args) {
        Swim_able sa = new Driver();
        Help_able ha = new Driver();
        sa.swim();
        ha.primaryСare();
        ha.putOutFire("Water");
        System.out.println(ha.PI);
    }

}
 class Employee {
    String name;
    int age;
    int experience;
    double salary = 100;public void eat() {
        System.out.println("He's eating");
    }

    public void sleep() {
        System.out.println("He's sleeping ");
    }
}
class Driver extends Employee implements Swim_able, Help_able {
    String nameOfCar;
    public  void  drive(){
        System.out.println("He's driving");
    }

    @Override
    public void swim() {
        System.out.println("Driver is swimming");

    }

    @Override
    public void primaryСare() {
        System.out.println("Driver care about someone");
    }

    @Override
    public void putOutFire(String s) {
        System.out.println("Driver put of fire somewhere " +s);
    }
}
 class Doctor extends Employee {
    public  void treat(){
        System.out.println("He's treatment");
    }
}
class Surgery extends Doctor {
    String operationTools;
    void cut() {
    }
}
class Dentist extends Doctor{
}

class Teacher extends Employee implements Help_able {
    String extendExperience;
    public  void  teach(){
        System.out.println("He's teaching");
    }

    @Override
    public void primaryСare() {
        System.out.println("Teacher care about someone");

    }

    @Override
    public void putOutFire(String s) {
        System.out.println("Teacher put of fire somewhere" + s);

    }
}

interface Help_able{
    public final static   double PI= Math.PI;
    void primaryСare();       // первая помощь
    void putOutFire(String s);      // тушить пожар
}

interface Swim_able{
    void swim();
}
abstract class Y implements Swim_able{

}
class X extends Y{

    @Override
    public void swim() {

    }
}