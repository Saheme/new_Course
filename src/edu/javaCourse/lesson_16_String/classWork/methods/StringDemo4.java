package edu.javaCourse.lesson_16_String.classWork.methods;

public class StringDemo4 {
    public static void main(String[] args) {
        String s1 = "Hello!";

        //13. метод isBlank() -> boolean, возвращает true, если строка состоит из симолов (пробел, TAB ) и аозвращает false если в строке кроме этих символов есть другие .
        String s2 = "    ";
        System.out.println(s1.isBlank());
        System.out.println(s2.isBlank());

        System.out.println("--------------------");

        //14. метод isEmpty()-> boolean, возвращает true, если в строке совсем нет никаких символов.
        boolean b1 = s1.isEmpty();
        String s3 = "";
        boolean b2 = s3.isEmpty();
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("--------------------");

        // 15. метод strip(), работает как trim() и лучше использовать его
        // метод s4.strip(), будут удалять пробелы от начала стороки до первого символа
         // метод stripTrailing(), будут удалять пробелы от последнего символа до конца строки.
        String s4 = "    Sky   ";
        System.out.println(s4.strip());
        System.out.println(s4.stripLeading());
        System.out.println(s4.stripTrailing());
    }

}
