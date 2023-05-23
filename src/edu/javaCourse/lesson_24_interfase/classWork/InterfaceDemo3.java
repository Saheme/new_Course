package edu.javaCourse.lesson_24_interfase.classWork;

public class InterfaceDemo3 {

}
interface I1{
    void abs();
default void def(){
    System.out.println("It's default method in interface ");
}
}
interface I2 extends I1{

}
class Something implements I1{

    @Override
    public void abs() {
        System.out.println("It's abs method ");
    }

    @Override
    public void def() {
        I1.super.def();
        System.out.println("Reloaded");
    }

    public static void main(String[] args) {
        Something s =new Something();
        s.def();
        s.abs();
        s.def();
    }
}