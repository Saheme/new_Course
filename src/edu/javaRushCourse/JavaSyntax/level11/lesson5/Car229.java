package edu.javaRushCourse.JavaSyntax.level11.lesson5;

import java.util.Objects;

/**
 * Напиши свою реализацию hashCode, используя переменные model и year. Если эти поля у двух объектов одинаковые,
 * то должен возвращаться одинаковый hashCode. Если правильно реализовать метод hashCode, вывод должен быть таким:
 * true
 * true
 * true
 * true
 * false
 * false
 *
 * Требования:
 * •	Нельзя изменять метод main.
 * •	В классе Car должен быть переопределен метод int hashCode().
 * •	Реализуй метод hashCode так, что бы результат работы программы соответствовал условию.
 */
public class Car229 {

        private String model;
        private int year;

        public Car229(String model, int year) {
            this.model = model;
            this.year = year;
        }

        public int hashCode(){
            return Objects.hash(model,year);
        }

        public static void main(String[] args) {
            Car229 lamborghini = new Car229("Lamborghini", 2020);
            Car229 lamborghini1 = new Car229("Lamborghini", 2020);
            Car229 ferrari = new Car229("Ferrari", 2020);
            Car229 ferrari1 = new Car229("Ferrari", 2020);
            Car229 bugatti = new Car229("Bugatti", 2020);
            Car229 bugatti1 = new Car229("Bugatti", 2020);
            System.out.println(ferrari.hashCode() == ferrari.hashCode());
            System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());
            System.out.println(ferrari.hashCode() == ferrari1.hashCode());
            System.out.println(bugatti.hashCode() == bugatti1.hashCode());
            System.out.println(bugatti.hashCode() == lamborghini.hashCode());
            System.out.println(lamborghini.hashCode() == ferrari.hashCode());
        }
}
