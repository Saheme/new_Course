package edu.javaRushCourse.JavaSyntax.level14.lesson4.classWork;

import java.util.HashMap;
import java.util.Map;

public class MakeMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Сергей", 21);
        map.put("Андрей", 18);
        map.put("Федор", 30);
        map.put("Марта", 22);
        map.put("Володя", null);

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + " " + value);
        }
    }
}
