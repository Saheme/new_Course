package edu.javaCourse.lesson_15.classWork.whileDemo;

public class WhileDemo3 {
    public static void main(String[] args) {
        boolean b = true;
        int a = 1;
        while (b){
            System.out.print(a + " ");
            if ((a % 3 == 0) && (a %7==0)){
                b=false;
            }
            a++;
        }
    }
}
