package edu.javaCourse.lesson_22.encapsulation.classWork.first;

public class PersonDemo {
    public static void main(String[] args) {
        Person per = new Person("male");
//        per.name = "Alex";
//        per.age = 23;
//        per.weight = 115;
        per.setName("Alex");
        per.setAge(23);
        per.setWeight(115);
        System.out.println(per.sex + " " + per.getName() + " " + per.getAge() + " " + per.getWeight());
        per.setAge(-30);
        System.out.println(per.getAge());
    }
}
