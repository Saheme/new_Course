package edu.javaRushCourse.JavaSyntax.level3.lesson9;

/**
 * В методе main напиши код попарного сравнения по ссылке строк string1, string2 и string3 с выводом соответствующего сообщения после каждого сравнения:
 * "ссылки на строки одинаковые" или "ссылки на строки разные".
 * <p>
 * Порядок сравнения должен быть следующим:
 * - строку string1 со строкой string2
 * - строку string2 со строкой string3
 * - строку string1 со строкой string3.
 * Требования:
 * •	Поля string1, string2 и string3 и их значения изменять нельзя.
 * •	В методе main должно быть сравнение строк string1 и string2 по ссылке.
 * •	В методе main должно быть сравнение строк string2 и string3 по ссылке.
 * •	В методе main должно быть сравнение строк string1 и string3 по ссылке.
 * •	Программа должна выводить соответствующие сообщения на экран.
 * •	Программа должна выводить на экран 3 строки.
 */
public class Task50 {
    public static String string1 = "Амиго";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        String same = "ссылки на строки одинаковые";
        String different = "ссылки на строки разные";
        String result1 = (string1 == string2) ? same : different;
        String result2 = (string2 == string3) ? same : different;
        String result3 = (string1 == string3) ? same : different;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
//if (string1 == string2) {
//        System.out.println(same);
//        }else {
//        System.out.println(different);
//        }