package edu.javaCourse.lesson_6.classWork.first;

public class MethodOverloading {
    public void show(int a){
        System.out.println(a);
    }
    public void show(boolean a){
        System.out.println(a);
    }
    public void show(String a){
        System.out.println(a);
    }
    public void show(String s, int a){
        System.out.println("String : " + s + " int : " +a);
    }
    public void show(int a, String str){
        System.out.println("It's a wonderful world !!! ");
    }

}
