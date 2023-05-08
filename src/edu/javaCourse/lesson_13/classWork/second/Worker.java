package edu.javaCourse.lesson_13.classWork.second;

public class Worker {
    public static void main(String[] args) {
        switch ("Monday"){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("I'm work to 18-00");
            case "Saturday", "Sunday" -> System.out.println("Weekend");
            default -> System.out.println("Rewrite a day please");
        }
    }
}
