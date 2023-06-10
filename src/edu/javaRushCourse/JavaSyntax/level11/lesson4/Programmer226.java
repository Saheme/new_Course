package edu.javaRushCourse.JavaSyntax.level11.lesson4;

public class Programmer226 {
    private int salary = 1000;

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        if (salary>this.salary){
            this.salary = salary;
        }

    }
}
