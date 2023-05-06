package edu.javaCourse.lesson_8.classwork.third;

public class SchoolBoy {
    String name;
    int grade;
    int a;

    static int count;

    public SchoolBoy(String name, int grade) {
        this.name = name;
        this.grade = grade;
        count++;
        System.out.println("Студент # " + count + " создан");
    }

    public static void showCount() {
        System.out.println("Всего созданно школьников : " + count);
    }

    public void showInfo() {
        System.out.println("Welcome my friend!!");
    }

    void abc() {
        a += 5;
    }

    public static void main(String[] args) {
        SchoolBoy sc = new SchoolBoy("Vasy", 2);
        SchoolBoy sc2 = new SchoolBoy("Pety", 3);
        SchoolBoy sc3 = new SchoolBoy("Andrey", 5);
        System.out.println(count);


        showCount();

    }


}
