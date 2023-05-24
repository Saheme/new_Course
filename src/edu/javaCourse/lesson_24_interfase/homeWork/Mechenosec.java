package edu.javaCourse.lesson_24_interfase.homeWork;

public class Mechenosec extends Fish{

    public Mechenosec(String name){
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Mechenosec ne xishnay riba, i ona est obichniy ribi koem");
    }

    public void swim(){
        System.out.println("Mechenosec krasivay riba kotoray bistro plavaet");
    }
}
