package edu.javaCourse.lesson_13.classWork.first;

public class SchoolBoyTest {
    public static void main(String[] args) {
        SchoolBoy sB = new SchoolBoy(1);
        //новый switch
        switch (sB.grade) {
            case 5 -> System.out.println("Отличник!!!");

            case 4 -> System.out.println("Парень хорошист");

            case 3 -> System.out.println("Так себе.");

            case 2 -> System.out.println("Беда");

            case 1 -> System.out.println("Беда, беда!!!");

            default -> System.out.println("Некорректная оценка");
        }

        // Реализация с if-else

       /* if (sB.grade==5){
            System.out.println("Отличник!!!");
        } else if (sB.grade==4) {
            System.out.println("Парень хорошист");
        } else if (sB.grade==3) {
            System.out.println("Так себе.");
        } else if (sB.grade==2) {
            System.out.println("Беда");
        } else if (sB.grade==1) {
            System.out.println("Беда, беда!!!");
        }else {
            System.out.println("Некорректная оценка");
        }*/


        // Реализация со switch старая версия
      /*  switch (sB.grade) {
            case 5:
                System.out.println("Отличник!!!");
                break;
            case 4:
                System.out.println("Парень хорошист");
                break;
            case 3:
                System.out.println("Так себе.");
                break;
            case 2:
                System.out.println("Беда");
                break;
            case 1:
                System.out.println("Беда, беда!!!");
                break;
            default:
                System.out.println("Некорректная оценка");}*/



        }
    }


