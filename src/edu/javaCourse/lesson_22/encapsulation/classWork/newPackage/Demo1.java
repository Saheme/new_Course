package edu.javaCourse.lesson_22.encapsulation.classWork.newPackage;
import edu.javaCourse.lesson_22.encapsulation.classWork.first.*;
public class Demo1 {
    public static void main(String[] args) {


        Person person = new Person("female");
        person.setName("Ohohoh");
        person.setAge(30);
        person.setWeight(115);
        System.out.print( person.getName() + " " + person.getAge() + " " + person.getWeight());

    }
}
