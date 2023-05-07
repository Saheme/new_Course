package edu.javaCourse.lesson_11.classWork.first;

public class WorkerTest {
    public static void main(String[] args) {
        Worker worker = new Worker("Alex", 1552.5);
        double result = worker.increaseSalary(worker.salary);
        System.out.println(result);
        System.out.println(worker.salary);
        System.out.println("------------");
        double result2 = worker.increaseSalary(worker.salary);
        System.out.println(result2);

    }
}
