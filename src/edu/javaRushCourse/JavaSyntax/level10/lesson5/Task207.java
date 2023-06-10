package edu.javaRushCourse.JavaSyntax.level10.lesson5;

/**
 * В этой задаче тебе нужно выполнить проверку URL-адреса.
 * <p>
 * Простая схема URL-адреса выглядит так:
 * <сетевой протокол>://<название ресурса>.<домен>
 * <p>
 * Метод checkProtocol(String) проверяет, какой сетевой протокол (http или https) у URL-адреса,
 * полученного входящим параметром, и возвращает результат проверки — строку название сетевого протокола.
 * А метод checkDomain(String) проверяет, какой домен (com, net, org или ru) у URL-адреса, полученного входящим параметром,
 * и возвращает результат проверки — строку название домена.
 * <p>
 * Если URL-адрес начинается не с http или https, то результат будет — "неизвестный".
 * Если URL-адрес заканчивается не на com, net, org или ru, то результат будет — "неизвестный".
 * <p>
 * main не принимает участие в тестировании.
 * <p>
 * Требования:
 * •	Нужно, чтобы метод checkProtocol(String) был реализован согласно условию.
 * •	Нужно, чтобы метод checkDomain(String) был реализован согласно условию.
 */
public class Task207 {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        if (url.startsWith("https")) {
            return "https";
        }else if (url.startsWith("http")) {
            return "http";
        } else {
            return "неизвестный";
        }
    }


    public static String checkDomain(String url) {
        if (url.endsWith("com")) {
            return "com";
        } else if (url.endsWith("net")) {
            return "net";
        } else if (url.endsWith("org")) {
            return "org";
        } else if (url.endsWith("ru")) {
            return "ru";
        } else {
            return "неизвестный";
        }
    }
}
