package edu.javaRushCourse.JavaSyntax.level13.lesson5;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 В методе main найди и удали язык программирования Pascal из списка programmingLanguages.

 Требования:
 •	В методе main должен удаляться Pascal из списка programmingLanguages.
 */
public class TAsk288 {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        System.out.println(programmingLanguages);
        programmingLanguages.remove(("Pascal"));
        System.out.println(programmingLanguages);

    }
}
