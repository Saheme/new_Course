package edu.javaRushCourse.JavaSyntax.level12.lesson5;

/**
 * Кажется, у нас есть лишняя скобка? Или одной не хватает? Разберись-ка с этой проблемой.
 * <p>
 * Требования:
 * •	В методе main класса Solution нужно исправить ошибки компиляции.
 */
public class Task254 {
    public static void main(String[] args) {
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            System.out.println("Windows detected!");
        }
    }
}
