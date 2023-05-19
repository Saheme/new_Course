package edu.javaCourse.lesson_22.encapsulation.classWork.first;

public class Person {
    final String sex;
    private String name;
    private int age;
    private int weight;

    private boolean cleverer;

    public Person(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0)
            this.weight = weight;
    }
    public boolean isClever(){
        return cleverer;
    }
    public void setClever(boolean cleverer){
        this.cleverer = cleverer;
    }

}
