package edu.professionalJava.part9_IO_And_NIO.lesson7_Serialisation.programmer1;

import java.io.Serializable;

public class Car implements Serializable {
    String model;
    String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
}
