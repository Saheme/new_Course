package edu.javaRushCourse.JavaSyntax.level14.lesson4;

import java.util.HashMap;

/**
 * В классе Solution объявлено поле grades типа HashMap<String, Double>, где ключ — имя и фамилия студента,
 * а значение - его средняя оценка. Твоя задача — реализовать метод addStudents, который добавит 5 студентов с их средней оценкой в коллекцию grades.
 * Значения можешь выбрать любые.
 *
 * Требования:
 * •	В классе Solution нужно инициализировать публичное статическое поле grades типа HashMap<String, Double>.
 * •	В классе Solution должен быть публичный статический метод addStudents с типом возвращаемого значения void.
 * •	Метод addStudents должен добавлять 5 студентов со средней оценкой в поле grades.
 */
public class Task310 {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Andrew" , 4.4);
        grades.put("Jone" , 3.8);
        grades.put("Witold" , 4.7);
        grades.put("Sarra" , 4.9);
        grades.put("Gerchard" , 4.3);
    }
}
