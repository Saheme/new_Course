package edu.javaCourse.lesson_20_ArrayList.classWork.inizializ;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        Car car1 = new Car();
        ArrayList list = new ArrayList();
        Student student = new Student();
        list.add("Hello!");
        list.add(car1);
        list.add(new Car());
        list.add(student);
        list .add(new StringBuilder("March"));

        ArrayList <String> list1 = new ArrayList<>();
        list1.add("Hello!");

        List<StringBuilder> list2 =new ArrayList<>();
        list2.add(new StringBuilder("Hello World!"));

    }


}

class Car{
}

class Student{

}

