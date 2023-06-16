package edu.javaCourse.Lesson_29_Generics.classWork;

public class GenericsClassDemo {
    public static void main(String[] args) {

        Info<String> str = new Info<>("Chit happens");
        System.out.println(str);
        String s = str.getValue();
        System.out.println(s);

        Info<Integer> number1 = new Info<>(100500);
        System.out.println(number1);
    }
}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "[{" + value + "}]";
    }



    public T getValue() {
        return value;
    }
}
