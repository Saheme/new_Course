package edu.javaCourse.lesson_27_Exeptions;

import java.io.IOException;

public class ExDemo11 {
}

class Animal{
    void run() throws IOException {
        System.out.println("Animal runs");
    }
}

class Mouse extends Animal{
    void run(){
        System.out.println("Mouse runs");
    }
}
