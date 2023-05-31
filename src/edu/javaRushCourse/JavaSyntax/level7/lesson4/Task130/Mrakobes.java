package edu.javaRushCourse.JavaSyntax.level7.lesson4.Task130;

public class Mrakobes {
    private static boolean isAlive = true;

    public static void setIsAlive(boolean value){
        isAlive=value;
    }


    public static void printState() {
        System.out.println("Амиго" + (isAlive ? " НЕ " : " ") + "победил Мракобеса Безумного");
    }
}
