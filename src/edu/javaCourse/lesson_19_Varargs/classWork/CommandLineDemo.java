package edu.javaCourse.lesson_19_Varargs.classWork;

public class CommandLineDemo {
    public static void main(String[] args) {
        System.out.println("first array of element : " + args[0]);
        System.out.println("Array length : " + args.length);

        for (String line : args  ) {
            System.out.print(line + " ");
        }
    }
}
