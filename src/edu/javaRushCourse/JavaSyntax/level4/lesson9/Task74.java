package edu.javaRushCourse.JavaSyntax.level4.lesson9;

/**
 * Амиго одевается в суперброню диггера, с помощью которой проникает вглубь планеты. В недрах планеты он должен уничтожить зараженных галабагами роботов.
 *
 * В этой части тебе предстоит вывести на экран слои планеты, которые Амиго будет преодолевать. Для реализации этой задачи используй вложенные циклы for.
 * Размер слоев: 10*10 символов. Для вывода в консоль используй переменную land.
 * Требования:
 * •	В консоль должен выводится прямоугольник 10*10 состоящий из символов равных символу переменной land.
 * •	Переменные класса не измен
 */
public class Task74 {
    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(land);
            }
            System.out.println();
        }
    }
}
