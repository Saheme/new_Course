package edu.javaRushCourse.JavaSyntax.level12.lesson3.Task244;

public class Window {
    private int height = 2;
    private int width = 3;

    public void changeSize(int height, int width){
        this.height = height;
        this.width = width;
    }

    public void printSize(){
        System.out.println("Height = " + height);
        System.out.println("Width = " + width);
    }
}
