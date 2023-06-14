package edu.javaRushCourse.JavaSyntax.level12.lesson4.Task249;

public class Outer {
     class Inner {
        Inner() {
            System.out.println("Создание объекта внутреннего класса");
        }
    }
    static class Nested {
        Nested() {
            System.out.println("Создание объекта вложенного класса");
        }
    }
}
