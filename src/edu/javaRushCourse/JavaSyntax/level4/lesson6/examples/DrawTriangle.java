package edu.javaRushCourse.JavaSyntax.level4.lesson6.examples;

public class DrawTriangle {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            int starcon = 10 - i;
            for (int j = 0; j < starcon; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
