package edu.javaCourse.lesson_23_overriding.classWork.seven;

public class A10 {
    String s1 = "Hello!";
    static double  d1 = 3.14;

    int summa(int ... a){
        int result =0;
        for (int val:a) {
            result+=val;
        }
        return result;
    }

    static  void abs(){
        System.out.println("Static method");
    }
}
