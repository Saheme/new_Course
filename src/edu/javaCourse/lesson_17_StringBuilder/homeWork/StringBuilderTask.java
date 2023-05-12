package edu.javaCourse.lesson_17_StringBuilder.homeWork;

public class StringBuilderTask {

    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        String str1 = new String(sb1);
        String str2 = new String(sb2);
        if (str1.equals(str2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");

        boolean b1 = ravenstvo(sb1, sb2);
        System.out.println(b1);
    }
}
