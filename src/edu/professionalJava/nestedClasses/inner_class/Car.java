package edu.professionalJava.nestedClasses.inner_class;

public class Car {
    String color;
    int countOfDoor;
    Engine engine;
    private static  int a;

    public Car(String color, int countOfDoor, int power) {
        this.color = color;
        this.countOfDoor = countOfDoor;
       // this.engine = this.new Engine(200);
    }
    public Car(String color, int countOfDoor) {
        Engine engine1 = new Engine(235);
        System.out.println(engine1.power);
        this.color = color;
        this.countOfDoor = countOfDoor;

    }

    public void setEngine(Engine engine){
        this.engine = engine;

    }



    @Override
    public String toString() {
        return "My car : {" +
                "color='" + color + '\'' +
                ", countOfDoor=" + countOfDoor +
                ", engine=" + engine +
                '}';
    }

    public   class Engine{
        int power;

        public Engine(int power) {
            this.power = power;
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
        Car car = new Car("black",4);
        System.out.println(car);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);
        System.out.println("------------------------");
        Car.Engine engine3 = new Car("Yellow",2).new Engine(350);
        System.out.println(engine3);
    }
}

