package edu.javaCourse.lesson_17_StringBuilder.classWork.methods;

public class StringBuilderMethods2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello World!");

        //9. метод reverse(), переварачивает StringBuilder
        System.out.println(sb1.reverse());

        System.out.println("------------------");

        // 10. метод replace(int start, int end , String s) -> StringBuilder, заменяет заданный отрезок  int start, int end  на какой-то заданный String
        StringBuilder sb2 = new StringBuilder("Hello World!");
        System.out.println(sb2.replace(3,5,"welcome"));

        System.out.println("------------------");

        // 11. метод capacity()-> int, возвращает вместимость StringBuilder
        StringBuilder sb3 = new StringBuilder("Hello World!");
        System.out.println(sb3.capacity());
    }
}
