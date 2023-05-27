package edu.javaCourse.lesson_25_polymorphism.homeWork;



public abstract class Fish extends Animal {
    public Fish(String name) {
        super(name);
        this.name =name;
    }

     void sleep(){
         System.out.println("Vsegda interesno nabludat kak spyt ribi");
     }
     abstract void swim();

}
