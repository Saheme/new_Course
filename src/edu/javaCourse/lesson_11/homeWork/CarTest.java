package edu.javaCourse.lesson_11.homeWork;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("red","V6",2);
        Car car2 = new Car("blue","V8",4);
        System.out.println("Машина " + car1.colour + " с двигателем " + car1.engine + " имеет " + car1.numberOfDoor + " двери");
        System.out.println("Машина " + car2.colour + " с двигателем " + car2.engine + " имеет " + car2.numberOfDoor + " двери");
        System.out.println("Меняем количество дверей : ");
        car1.changeNumberOfDoor(6);
        car2.changeNumberOfDoor(2);
        System.out.println("Машина " + car1.colour + " с двигателем " + car1.engine + " имеет " + car1.numberOfDoor + " двери");
        System.out.println("Машина " + car2.colour + " с двигателем " + car2.engine + " имеет " + car2.numberOfDoor + " двери");
        System.out.println("Меняем цвета : ");
        Car.changeColour(car1,car2);
        System.out.println("Машина " + car1.colour + " цветом" );
        System.out.println("Машина " + car2.colour + " цветом" );

    }
}
