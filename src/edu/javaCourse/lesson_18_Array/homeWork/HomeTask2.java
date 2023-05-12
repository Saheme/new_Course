package edu.javaCourse.lesson_18_Array.homeWork;

public class HomeTask2 {

    public static void showArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
                System.out.print("{ " );
            for (int j = 0; j < array[i].length; j++) {
                System.out.print( array[i][j] + " " );
            }
            System.out.print( " }");
        }

    }

    public static void main(String[] args) {
        String[][] array = {{"world", "place", "flat" },
                {"wind", "sky", "grand" },
                {"Capital", "peaceful", "cottage" }};
            showArray(array);
        ;
    }
}
