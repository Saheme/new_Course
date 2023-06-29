package edu.professionalJava.part4_Collections.lesson7_LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan",3);
        Student st2 = new Student("Olga",2);
        Student st3 = new Student("Artem",5);
        Student st4 = new Student("Alex",1);
        Student st5 = new Student("Sveta",4);

        LinkedList<Student>list= new LinkedList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        System.out.println("LinkedList : " + list);
        System.out.println(list.get(2));

        list.add(new Student("Natasha", 3));
        System.out.println(list);
        System.out.println("-----------------");
        list.add(1,new Student("Aleksandr",5));
        System.out.println("LinkedList : " + list);
        System.out.println("-----------------");
        list.remove(4);
        System.out.println("LinkedList : " + list);

    }


}

class Student{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}

