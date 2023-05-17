package edu.javaCourse.lesson_16_String.classWork.methods;

public class StringDemo3 {
    public static void main(String[] args) {
        String s1 = new String("!Hello!");

        //10. метод toLowerCase()-> String, делает все буквы задданой строки прописными.
        String str1 = s1.toLowerCase();
        System.out.println(str1);

        System.out.println("------------------");

        //11. метод toUpperCase() -> String, делает все буквы задданой строки заглавными.
        String str2 = s1.toUpperCase();
        System.out.println(str2);

        System.out.println("------------------");

        //12. метод contains()-> boolean, говорит содержит ли строка заданный эллемент строки
        boolean b = s1.contains("ll");
        System.out.println(b);

        System.out.println("------------------");

        // ниже показан метод chaning который звдвет порядок выполнения методов через точку слева направо
        String st1 = "   Hello World!";
        String st2 = "I'm a pilot ";
        String st3 = st1.concat(st2).trim().replace("I'm a pilot", "I'm foolish").substring(3, 20);
        System.out.println(st3);

        System.out.println(st1.substring(st1.indexOf('W')));

    }
}
