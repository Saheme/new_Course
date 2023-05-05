package edu.javaCourse.lesson_5.homeWork.first;

public class BankAccount1 {
    int id;
    double account;

    public BankAccount1(int id, double account) {
        this.id = id;
        this.account = account;
    }

    double popolnenieSheta(double increase){
        return account+=increase;
    }
    double snytieSoSheta(double decrease){
        return account-=decrease;
    }
}
