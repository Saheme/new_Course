package edu.javaCourse.lesson_5.classWork.forth;

public class TestHuman {
    public static void main(String[] args) {


        Human human = new Human("Alex", new Car4("black","A6"),new BankAccount(125,2548.56));
        human.showInfo();

   /* Human human = new Human("Alex");
    human.car = new Car4("white" , "A5");
    human.account = new BankAccount(5,158.5);
    human.showInfo();*/
    }
}
