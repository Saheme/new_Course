package edu.javaCourse.lesson_22.encapsulation.homeWork.first;

/**
 * Создайте класс Student со следующими параметрами: name(используйте StringBuilder), course, grade.
 * Примените инкапсуляцию к данному классу.Длинна имени объектов не должна быть менее 3-х символов,
 * оценки должны быть числами в интервале от 1 до 10, курс должен быть числом от 1 до 4 включительно.
 * Создайте метод showInfo, который будет выводить всю информацию о студенте, не используя переменные класса напрямую.
 * Создайте клас TestStudent, в котором создайте объект класса Student, придайте его переменным значения.
 * Произведите вызов метода showInfo.
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName(new StringBuilder("Alex"));
        student.setCourse(5);
        student.setGrade(5);
        student.showInfo();
    }
}
