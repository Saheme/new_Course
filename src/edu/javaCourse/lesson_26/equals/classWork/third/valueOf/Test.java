package edu.javaCourse.lesson_26.equals.classWork.third.valueOf;

import edu.javaCourse.lesson_23_overriding.classWork.six.B;

public class Test {
    public static void main(String[] args) {

        Integer i1 = Integer.valueOf(10);
        System.out.println(i1);

        String s1 = "3.14";
        Double d2 = Double.valueOf(s1);
        System.out.println(d2);
        Byte b = new Byte((byte) 5);
    }
}
