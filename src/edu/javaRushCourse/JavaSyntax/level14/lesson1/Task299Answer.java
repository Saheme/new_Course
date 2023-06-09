package edu.javaRushCourse.JavaSyntax.level14.lesson1;

import java.util.Arrays;
import java.util.HashSet;

public class Task299Answer {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for(String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        HashSet <String> set = new HashSet<>();
        set.addAll(Arrays.asList(strings));
        return set;
    }
}
