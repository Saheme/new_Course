package edu.javaRushCourse.JavaSyntax.level12.lesson6;

import java.util.ArrayList;
import java.util.List;

/**
 * У нас есть группа в университете и метод, который должен отчислять конкретного студента, но он почему-то не работает.
 * Твоя задача — найти ошибку и исправить, чтобы метод exclude смог отчислить студента.
 *
 * Требования:
 * •	В классе UniversityGroup должно быть публичное не статическое поле students типа List<String>.
 * •	В классе UniversityGroup должен быть публичный не статический метод exclude(String) с типом возвращаемого значения void.
 * •	Метод exclude должен удалять из списка переданного студента.
 */
public class Task265 {
    public List<String> students;

    public Task265() {
        students = new ArrayList<>();
        students.add("Сергей Фрединский");
        students.add("Виталий Правдивый");
        students.add("Максим Козыменко");
        students.add("Наталия Андрющенко");
        students.add("Ира Величенко");
        students.add("Николай Соболев");
        students.add("Снежана Слободенюк");
    }

    public void exclude(String excludedStudent) {
        List<String> copy = new ArrayList<>(students);
        for (String student : copy) {
           if (student.equals(excludedStudent)) {
              students.remove(student);
           }
       }
    }
    //Второй способ удаления с помощью лябда -функции
    public void exclude2(String excludedStudent){
        students.removeIf(student-> student.equals(excludedStudent));
    }

    public static void main(String[] args) {
        Task265 universityGroup = new Task265();
        universityGroup.exclude("Виталий Правдивый");
        universityGroup.exclude2("Максим Козыменко");
        universityGroup.students.forEach(System.out::println);
    }
}
