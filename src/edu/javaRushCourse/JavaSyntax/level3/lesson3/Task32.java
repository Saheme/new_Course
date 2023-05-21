package edu.javaRushCourse.JavaSyntax.level3.lesson3;

/**
 * Диего и Амиго стоят возле здания фабрики с закрытыми воротами.
 * Сыпятся ошибки компиляции, из-за чего дверь не открывается.
 * Нужно исправить ошибки компилятора и дверь откроется.
 *
 * Требования:
 * •	Исправь ошибку компиляции не меняя функционал программы.
 */
public class Task32 {
    public static void main(String[] args) {
        boolean isFabricOpen = true;
        if (isFabricOpen) {
            System.out.println("Дверь открыта");
        } else {
            System.out.println("Дверь закрыта");
        }
    }
}
