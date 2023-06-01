package edu.javaRushCourse.JavaSyntax.level8.lesson1;

/**
 * В методе main() измени порядок вызова методов System.out.print() таким образом, чтобы вывод на консоль был: "Hello char".
 * Значение переменных не изменяй. В методе main() никакого кода больше не дописывай.
 *
 * Требования:
 * •	Программа должна выводить "Hello char" в консоли.
 * •	Значения переменных должны остаться прежними.
 * •	В методе main() не должно появиться нового кода.
 */
public class Task151 {
    public static char char2 = 'H';
    public static char char1 = 101;
    public static char char3 = 114;
    public static char char4 = '\u006F';
    public static char char5 = 108;
    public static char char6 = 'h';
    public static char char7 = 0x0063;
    public static char char8 = ' ';
    public static char char9 = 'l';
    public static char char10 = 0x61;

    public static void main(String[] args) {
        System.out.print(char2);    //H
        System.out.print(char1);    //e
        System.out.print(char5);    //l
        System.out.print(char9);    //l
        System.out.print(char4);    //o
        System.out.print(char8);   // " "
        System.out.print(char7);    //c
        System.out.print(char6);    //h
        System.out.print(char10);   //a
        System.out.print(char3);    //r
        System.out.println();
    }
}
