package edu.javaCourse.lesson_16_String.homeWork;

public class Email {
    public static void realizeEmail(String str) {
        String result = str.substring(str.indexOf('@'), str.indexOf('.')).replace("@", "");
        System.out.println(result.toUpperCase());
    }

    public void realizeEmail2(String str) {
        int a = 0; // позиция символа '@'
        int b = 0; // позиция символа '.'
        int c = 0; // позиция символа ';'

        while (c < str.length() - 1) {

            a = str.indexOf('@', c);
            b = str.indexOf('.', c);
            c = str.indexOf(';', c + 1);
            System.out.println(str.substring(a + 1, b));
        }
    }


    public static void main(String[] args) {
        realizeEmail("dfdg@gmail.com;");
        realizeEmail("re@yandex.ru;");
        Email email = new Email();
        email.realizeEmail2("ya@yahoo.com; on@mail.ru; ona@gmai.com;");
    }
}


//"dfdg@gmail.com"
//"ya@yahoo.com; on@mail.ru; ona@gmai.com"