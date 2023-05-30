package edu.javaCourse.lesson_26.equals.classWork.second.toString;

 class Car {
    String colour;
    String engine;

     public Car(String colour, String engine) {
         this.colour = colour;
         this.engine = engine;
     }

     public String toString(){
        return "Car has a colour : " + colour + " Car has  engine : " + engine;
    }
}

   public class TestCar {
        public static void main(String[] args) {
            Car car1 = new Car("red", "V6");
            Car car2 = new Car("black", "V8");

            System.out.println(car2);
            System.out.println(car1.toString());
        }
    }

