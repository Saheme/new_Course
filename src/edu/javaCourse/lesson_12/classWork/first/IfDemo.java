package edu.javaCourse.lesson_12.classWork.first;

public class IfDemo {
    public static void main(String[] args) {
        int a = 50;
        if (a < 30) {
            System.out.println("a < 20");
        } else {
            System.out.println("a > 20");
        }
        System.out.println("Hello everybody!");
        System.out.println("------------------------------------------");

        int salary= 300;
        if (salary<200){
            System.out.println("Salary is too less!");
        } else if (salary==0) {
            System.out.println("Salary is usual");
        } else if (salary>300) {
            System.out.println("Salary is dreaming");
        }else {
            System.out.println("I'm unemployed");
        }
    }
}
