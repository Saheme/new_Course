package edu.javaRushCourse.JavaSyntax.level9.lesson6.example;

public class Ex2 {
    public static void main(String[] args) {
        String s = Integer.toBinaryString(108);
        String d = Integer.toBinaryString(~108);
        System.out.println(s);
        System.out.println(d);
    }
}
