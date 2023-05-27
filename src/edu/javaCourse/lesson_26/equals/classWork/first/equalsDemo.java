package edu.javaCourse.lesson_26.equals.classWork.first;

import java.util.ArrayList;

public class equalsDemo {
    public static void main(String[] args) {


        Car c1 = new Car("red", "V6");
        Car c2 = new Car("red", "V6");
        Car c3 = new Car("blue", "V4");

        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));

        ArrayList<Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        Car c4 = new Car("blue", "V4");
        System.out.println(list.contains(c4));
    }
}

class Car {
    String colour;
    String engine;

    public Car(String colour, String engine) {
        this.colour = colour;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car c2 = (Car) obj;
            return (colour.equals(c2.colour) && engine.equals(c2.engine));
        } else {
            return false;
        }
    }


}

//if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Car car = (Car) o;
//        return Objects.equals(colour, car.colour) && Objects.equals(engine, car.engine);