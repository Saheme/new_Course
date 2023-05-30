package edu.javaCourse.lesson_26.equals.classWork.Four;

public class InitializirsgDemo {
    public InitializirsgDemo() {
        System.out.println("This is construction");
    }

    {
        System.out.println("This is int block");
    }
    static {
        System.out.println("this is Static");
    }

    public static void main(String[] args) {
        InitializirsgDemo in = new InitializirsgDemo();
        InitializirsgDemo in2 = new InitializirsgDemo();
        InitializirsgDemo in3 = new InitializirsgDemo();
    }

}
