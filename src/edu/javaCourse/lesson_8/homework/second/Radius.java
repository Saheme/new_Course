package edu.javaCourse.lesson_8.homework.second;

public class Radius {
    static final double PI = 3.14;



    public double areaOfCircle(int radius){
        return PI*radius*radius;
    }
    public static double perimeterOfCircle(int r){
        return 2* PI *r;
    }

    public void radiusInfo(int r){
        System.out.println("Радиус = " + r + " ,площадь круга = " + areaOfCircle(r) + " , длинна окружности : " + perimeterOfCircle(r));
    }


}
