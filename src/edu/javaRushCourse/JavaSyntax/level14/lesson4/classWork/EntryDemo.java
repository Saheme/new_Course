package edu.javaRushCourse.JavaSyntax.level14.lesson4.classWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Сергей", 21);
        map.put("Андрей", 18);
        map.put("Федор", 30);
        map.put("Марта", 22);
        map.put("Володя", null);

        //Set<Map.Entry<String,Integer>> entries =map.entrySet();
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " " + value);
        }

        for (var s : map.entrySet()) {
            String key = s.getKey();
            Integer value = s.getValue();
            System.out.println(key + " " + value);

        }
    }
}
