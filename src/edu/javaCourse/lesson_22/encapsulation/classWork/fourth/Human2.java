package edu.javaCourse.lesson_22.encapsulation.classWork.fourth;

public class Human2 {
    String name ;
    String surname ;



   public Human2(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public Human2(String name){
       this(name,null);

    }

    public void work(){
        System.out.println("I'm working harder");
    }
    public static void rest(){
        System.out.println("I'm resting wonderful!");
    }
}
