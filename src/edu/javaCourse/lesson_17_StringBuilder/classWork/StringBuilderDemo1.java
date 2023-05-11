package edu.javaCourse.lesson_17_StringBuilder.classWork;

public class StringBuilderDemo1 {
    public static void main(String[] args) {

        // Конструкторы StringBuilder
        StringBuilder sb1 = new StringBuilder(); //по умолчанию вместимость (capacity) равна 16 символов
        StringBuilder sb2 = new StringBuilder("Good day!");
        StringBuilder sb3 = new StringBuilder(50); // число показывает вместимость строки (50 символов)
        StringBuilder sb4 = new StringBuilder(sb2);

        // Пример
        StringBuilder strB1 = new StringBuilder("123");
        StringBuilder strB2 = strB1.append("45");
        strB2 = strB2.append("6").append("7");
        System.out.println("strB1 = " + strB1);
        System.out.println("strB2 = " + strB2);

        System.out.println("------------------");

        //Сравнение
        StringBuilder sb5 = new StringBuilder("123");
        StringBuilder sb6 = new StringBuilder("123");
        System.out.println(sb5.equals(sb6));
        System.out.println(sb5==sb6);

        System.out.println("------------------");

        StringBuilder sb7 = new StringBuilder("Hello! ");
        StringBuffer sb8 = new StringBuffer("Goodbye");
        String str1 = new String(sb7);
        String str2 = new String(sb8);
        System.out.println(str1);
        System.out.println(str2);
    }
}
