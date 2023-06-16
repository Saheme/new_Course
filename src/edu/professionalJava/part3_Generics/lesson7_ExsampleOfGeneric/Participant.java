package edu.professionalJava.part3_Generics.lesson7_ExsampleOfGeneric;

public abstract class Participant { // участники
    private String name;
    private int age;

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
