package edu.javaCourse.lesson_6.classWork.second;

public class MethodOverloadingTest2 {
    public static void main(String[] args) {
        MethodOverloading2 mo2 =new MethodOverloading2();
        int sum1 = mo2.sum(2, 5);
        System.out.println(sum1);
        String sum2 = mo2.sum("Hello!! ", " Nighter");
        System.out.println(sum2);

    }
}
