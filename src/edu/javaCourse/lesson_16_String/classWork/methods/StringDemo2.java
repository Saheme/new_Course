package edu.javaCourse.lesson_16_String.classWork.methods;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("!Hello!");
        String s2 = "    World of something     ";

        //6. метод substring() -> String , возвращает кусок строки с заданного индекса и до конца строки.
        // перегруженный(overload) задает рамки с какого по какой символ выводить кусок строки, конечный индекс включен не будетю
        String str1 = s1.substring(3);
        System.out.println(str1);
        String str2 = s1.substring(2, 5);
        System.out.println(str2);

        System.out.println("------------------");

        // 7. trim -> String, убирает пробелы с боков от ковычек до первого и  до последнего символа, не трогает пробелы, которые внутри строки.
        String str3 = s2.trim();
        System.out.println(str3);

        System.out.println("------------------");

        // 8.replace() -> String, заменяет заданный символ в строке на другой заданный символ, если задаваемых символов больше одного заменяются все.
        // перегруженный(overload) вместо символа использует строку
        String str4 = s1.replace('!','W');
        System.out.println(str4);
        String str5 = s1.replace("!He","ROAR");
        System.out.println(str5);

        System.out.println("------------------");

      //9. метод concat() -> String, к строке прибавляет другую строку , заданную в параметрах
        String str6 = s1.concat(s2);
        System.out.println(str6);


    }
}
