package edu.professionalJava.part5_NestedClasses.lesson1.static_nested_class;

public class Car {
    String color;
    int countOfDoor;
    Engine engine;
   private static  int a;

    public Car(String color, int countOfDoor, Engine engine) {
        this.color = color;
        this.countOfDoor = countOfDoor;
        this.engine = engine;
    }

    private void method(){
        System.out.println(Engine.countOfObjects);
        Engine engine1 = new Engine(258);
        System.out.println(engine1.power);
    }

    @Override
    public String toString() {
        return "My car : {" +
                "color='" + color + '\'' +
                ", countOfDoor=" + countOfDoor +
                ", engine=" + engine +
                '}';
    }

    public  static class Engine{
        int power;
        static int countOfObjects;

        public Engine(int power) {
            this.power = power;
            System.out.println(a);
            countOfObjects++;
            //System.out.println(countOfDoor);
        }

        @Override
        public String toString() {
            return " My engine : {" +
                    "power=" + power +
                    '}';
        }
    }
}

class Test{
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);

        Car car = new Car("black",4,engine);
        System.out.println(car);


    }
}

class V extends Car.Engine{

    public V(int power) {
        super(power);
    }
}
