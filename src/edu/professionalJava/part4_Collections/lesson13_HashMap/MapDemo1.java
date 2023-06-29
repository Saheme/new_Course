package edu.professionalJava.part4_Collections.lesson13_HashMap;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1000,"Aleksandr Rojkov");
        map.put(2000,"Nikiforov Anatoliy");
        map.put(3000,"Tamara Snouden");
        map.put(4000,"Jone Baiden");
        map.put(null,"Jony Depp");
        map.putIfAbsent(2500,"Anastasiy Star"); //метод - добавь если отсутствует проверка по ключу
        System.out.println(map);
        System.out.println("---------------");

        System.out.println(map.get(3000));// метод get() - выводит значение по ключу, если такого ключа нет ,то будет выведено null
        map.remove(3000); // метод удаляет по ключу
        System.out.println(map);
        System.out.println("---------------");
        boolean nikiforovAnatoliy = map.containsValue("Nikiforov Anatoliy"); // метод возвращает true если такое значение есть в map
        System.out.println(nikiforovAnatoliy);
        boolean key = map.containsKey(1000); // проверяет есть ли такой ключ в map
        System.out.println(key);
        System.out.println("---------------");
        System.out.println(map.keySet()); // метод возвращает множество ключей , которые есть в map
        System.out.println(map.values()); // метод возвращает множество значений , которые есть в map

    }
}
