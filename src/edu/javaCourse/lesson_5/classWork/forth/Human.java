package edu.javaCourse.lesson_5.classWork.forth;

public class Human {
    String name;
    Car4 car;
    BankAccount account;

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, Car4 car, BankAccount account) {
        this.name = name;
        this.car = car;
        this.account = account;
    }

    void showInfo(){
        System.out.println("Человек " + name + " цвет его машины : " + car.color + " с двигателем  - " + car.engine + "  его счет в банке : " + account.id + " с балансом " + account.balance );
    }
}
