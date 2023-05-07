package edu.javaCourse.lesson_9.classWork.first;

public class Boat {
    String color; // instance variable (переменная объекта), видимость везде где виден объект
    String engine;
    static int count; //static variable (переменная класса)

    public Boat(String color, String engine) {
        this.color = color;
        this.engine = engine;
        count++;
    }

    public void showColour(){
        System.out.println("Лодка покрашена в " + color + " цвет.");
    }

    public void changeColour(String color){ // переменная параметра метода , видимость до конца метода
        System.out.println("Цвет машины изменился");
        int price = 5000; // Local variable (локальные переменные) - переменные созданные внутри метода, видимость до конца блока где объявленна
        this.color = color;
        price +=1000;
    }
}
