package edu.javaCourse.lesson_16_String.classWork.forth;

public class CompareStrings {
    public static void main(String[] args) {
        String s1 = new String("Ok");
        String s2 = new String("Ok");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println();
        String s3 = "Hello!";
        String s4 = "Hello!";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s1 != s4);
        System.out.println();
        String s5 = "Boy";
        String s6 = "boy";
        System.out.println(s5.equals(s6));
        System.out.println(s5.equalsIgnoreCase(s6));
    }
}
