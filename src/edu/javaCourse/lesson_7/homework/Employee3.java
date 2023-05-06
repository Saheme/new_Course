package edu.javaCourse.lesson_7.homework;

public class Employee3 {
    int id;
    public String surname;

    private double salary;

    public Employee3(int id, String surname , double salary){
        this.id = id;
        this.surname = surname;
        this.salary = salary;
    }

     Employee3(String surname , double salary){
        this.surname = surname;
        this.salary = salary;
    }
    private Employee3(){

    }


    public void showId(){
        System.out.println(id);
    }
    public void showSurname(){
        System.out.println(surname);
    }
    public void showSalary(){
        System.out.println(salary);
    }


}



