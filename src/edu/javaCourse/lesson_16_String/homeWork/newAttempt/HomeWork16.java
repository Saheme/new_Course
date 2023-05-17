package edu.javaCourse.lesson_16_String.homeWork.newAttempt;

/**
 * Создайте клас , в котором создайте метод email.Данный клас должен принимать в input 1 String параметр.
 * Данный параметр должен содержать в себе emails в следующем виде
 * ya@yahoo.com; on@mail.ru; ona@gmail.com
 * т.е после каждого email, должен стоять " ; ". Метод должен выводитьна экран информацию о том какой почтой
 * пользуются исходя из параметров ,т.е output должен быть следующего вида:
 * yahoo
 * mail
 * gmail
 */
public class HomeWork16 {

    public static void email(String str) {
        char ch;
        int begin = 0;
        int end = 0;
        for (int i = 0; i < str.length()-1; i++) {
            ch = str.charAt(i);
            if (ch == '@') {
               begin = i;
            }
            if (ch=='.'){
                end = i;
            }
            System.out.println(str.substring(begin,end));

        }

        System.out.println();
    }

    public static void main(String[] args) {
        email("ya@yahoo.com; on@mail.ru; ona@gmail.com");
    }
}



