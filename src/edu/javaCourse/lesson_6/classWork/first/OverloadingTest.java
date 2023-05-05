package edu.javaCourse.lesson_6.classWork.first;

public class OverloadingTest {
    public static void main(String[] args) {
        MethodOverloading variable = new MethodOverloading();
        int num = 5000;
        variable.show(num);
        boolean a = true;
       variable.show(a);

    String str = "Hello!!!";
    variable.show(str);

    variable.show(str,num);
    variable.show(num,str);
    }
}
