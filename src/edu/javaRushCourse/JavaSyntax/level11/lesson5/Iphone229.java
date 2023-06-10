package edu.javaRushCourse.JavaSyntax.level11.lesson5;

/**
 *
 В методе main создаются два айфона с одинаковыми параметрами.
 В консоли выводится результат их сравнения. Разберись, почему сейчас результат отрицательный и сделай так, чтобы он был положительным.
 Для этого тебе нужно переопределить метод equals(Iphone), который будет учитывать все параметры.
 У двух равных объектов значения полей должны быть одинаковыми. Метод main не участвует в проверке.

 Требования:
 •	В классе Iphone долж од public boolean equals(Object).
 •	Метод equals должен возвращать true для двух равных объектов типа Iphone и false — для разных.
 •	Метод equals должен возвращать false, если в него передали null.
 */
public class Iphone229 {
    private String model;
    private String color;
    private int price;

    public Iphone229(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Iphone229 iphone = (Iphone229) o;
        return this.price != 0&& price == iphone.price &&this.model != null&& model.equals(iphone.model) &&this.color != null&& color.equals(iphone.color);
    }

    public static void main(String[] args) {
        Iphone229 iphone1 = new Iphone229("X", "Black", 999);
        Iphone229 iphone2 = new Iphone229("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }
}
