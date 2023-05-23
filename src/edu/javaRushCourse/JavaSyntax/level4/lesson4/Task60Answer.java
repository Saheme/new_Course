package edu.javaRushCourse.JavaSyntax.level4.lesson4;

public class Task60Answer {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        while (number <= 100) {
            if (number % 3 == 0) {
                number++;
                continue;
            }
            sum = sum + number;
            number++;
        }
        System.out.println(sum);
    }
}
