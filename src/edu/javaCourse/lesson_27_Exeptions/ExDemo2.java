package edu.javaCourse.lesson_27_Exeptions;

public class ExDemo2 {
    public static void main(String[] args) {
        int[]array ={4,8,12};
        System.out.println("У нас есть массив");
        try {
            System.out.println(array[1]);
        System.out.println("Всем хорошего дня");
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Такого индекса не существует, исключение : " + ex );
        }
        finally {
            System.out.println("Это finally блок");
        }
        System.out.println("Выполняется в любом случае");
    }
}
