package edu.javaCourse.lesson_16_String.classWork.methods;

public class StringDemo1 {
    public static void main(String[] args) {

        String s1 = new String("!Hello!");

        // 1. метод length() - длинна , возвращает(->) int длинну строки
        int strLength = s1.length();
        System.out.println("Длинна строки : " + strLength + " символов.");
        System.out.println("Длинна строки : " + s1.length() + " символов.");

        System.out.println("---------------------------");

        // 2.метод charAt(int index) -> char , показывает какой char эллемет находится в заданном индексе в строке
        char c = s1.charAt(6);
        System.out.println("Второй эллемент в строке, символ : " + c);

        System.out.println("---------------------------");

        // 3. метод indexOf(4 перезаписанных метода overload) -> int , показывает на каком индексе находится определенный char или String , и выдает -1 если такого char или String нет
        int i1 = s1.indexOf('o');
        System.out.println(i1);

        int i2 = s1.indexOf("lo!");
        System.out.println(i2);

        int i3 = s1.indexOf('!', 3); //начинает поиск char или String с определенного индекса
        System.out.println(i3);

        int i4 = s1.indexOf("lo", 4); //начинает поиск char или String с определенного индекса
        System.out.println(i4);

        System.out.println("---------------------------");

        // 4. метод startsWith() -> boolean , запрашивает, начинается ли строка с задданого символа регистр учитывается
        // в перегруженной версии , задается еще и точка начала поисков
        boolean b1 = s1.startsWith("!H");
        System.out.println(b1);
        boolean b2 = s1.startsWith("l",4);
        System.out.println(b2);

        System.out.println("---------------------------");

        //5. метод endsWith() -> запрашивает, заканчивается ли строка с задданого символа регистр учитывается
        boolean b3 = s1.endsWith("o!");
        System.out.println(b3);

    }
}
