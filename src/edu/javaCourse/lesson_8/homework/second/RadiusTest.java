package edu.javaCourse.lesson_8.homework.second;

public class RadiusTest {
    public static void main(String[] args) {
        Radius ra = new Radius();
        double areaOfCir = ra.areaOfCircle(5);
        System.out.println(areaOfCir);
        System.out.println("------------");

        double perimetr = Radius.perimeterOfCircle(5);
        System.out.println(perimetr);
        System.out.println("-------------");

        ra.radiusInfo(5);

    }
}
