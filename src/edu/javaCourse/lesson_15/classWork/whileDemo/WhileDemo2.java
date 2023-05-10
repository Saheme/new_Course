package edu.javaCourse.lesson_15.classWork.whileDemo;

public class WhileDemo2 {
    public static void main(String[] args) {
        int money = 100;
        while (money > 0) {
            System.out.println("Делайте ставку");
            money-=10;
            System.out.println("Вы проиграли " + money);
        }
    }
}
