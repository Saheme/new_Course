package edu.javaRushCourse.JavaSyntax.level3.lesson7.compereDouble;

public class CompereDoubleDemo {
    public static void main(String[] args) {
        double a = 1.000001;
        double b = 1.000002;

        if (Math.abs(b-a)<0.0001){
            System.out.println("Числа равны");
        }else {
            System.out.println("числа не равны");
        }
    }
}
