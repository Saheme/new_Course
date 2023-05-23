package edu.javaCourse.lesson_24_interfase.classWork.interfaceDemo;

public class InterfaceStaticDemo {
    public static void main(String[] args) {
        SchoolBoy sb = new SchoolBoy();
        sb.def();
        //sb.abs();
        DoSomething.abs();


    }
}

interface DoSomething{
    static void abs(){
        System.out.println("This is a static method");
    }
    default  void def(){
        System.out.println("This is default method");
    }
}

class SchoolBoy implements DoSomething{

}
