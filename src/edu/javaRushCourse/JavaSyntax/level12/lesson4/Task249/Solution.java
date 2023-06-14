package edu.javaRushCourse.JavaSyntax.level12.lesson4.Task249;

/**
 * В классе Outer есть внутренний (Inner) и вложенный (Nested) классы. В методе main класса Solution создай по одному объекту каждого из них.
 *
 * Требования:
 * •	В методе main класса Solution должен быть создан объект класса Inner.
 * •	В методе main класса Solution должен быть создан объект класса Nested.
 * •	Класс Outer изменять нельзя.
 */
public class Solution {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Outer.Nested nested = new Outer.Nested();

    }
}
