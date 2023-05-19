package edu.javaCourse.lesson_21.Garbage.classWork;

import edu.javaCourse.lesson_8.homework.second.Radius;

public class ReturnDemo {
    int abs (){
        return 5;
    }
    int abs2(int i){
        if (i>10){
            return 10;
        }else
        return 5;
    }

    public static void main(String[] args) {
        int a = new ReturnDemo().abs();
    }
}
