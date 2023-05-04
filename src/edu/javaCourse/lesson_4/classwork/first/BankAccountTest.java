package edu.javaCourse.lesson_4.classwork.first;

import edu.javaCourse.lesson_4.classwork.first.BankAccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();
        myAccount.id = 1;
        myAccount.name = "счет Александра";
        myAccount.balance = 38.46;
        System.out.println( " id счета : " +myAccount.id + " чей " + myAccount.name + " сколько на счете - " + myAccount.balance);
    }
}
