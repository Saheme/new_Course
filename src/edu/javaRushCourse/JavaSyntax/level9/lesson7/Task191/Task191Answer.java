package edu.javaRushCourse.JavaSyntax.level9.lesson7.Task191;

public class Task191Answer {
    public static void main(String[] args) {
        Diego[] diegos = new Diego[99];
        for (int i = 0; i < diegos.length; i++) {
            diegos[i] = new Diego();
        }

        System.out.print(diegos[0].hashSum + " ^ ");
        Nimrod[] nimrods = dealWithDuplicates(diegos);
        System.out.println(nimrods[0].password + " = " + diegos[0].hashSum);
    }

    public static Nimrod[] dealWithDuplicates(Diego[] diegos) {
        Nimrod[] nimrods = new Nimrod[diegos.length];
        for (long i = 51392261; i < diegos.length + 51392261; i++) {
            int password = 31 * (int) (i ^ (i >>> 32));
            int index = (int) i - 51392261;
            diegos[index].hashSum ^= password;
            nimrods[index] = new Nimrod();
            nimrods[index].password = password;
        }

        return nimrods;
    }
}
