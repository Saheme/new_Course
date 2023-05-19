package edu.javaCourse.lesson_19_Varargs.homeWork;

public class HomeTask {

    public static String[] abc (String[] ... array1){
        int length =0; // надо узнать длинну
        for (String[] array2:array1) { // с помощью цикла складываем количество длин массивов
            length+=array2.length;
        }
        String []target = new String[length]; // новый массив с длинной length.
        int count =0;
        for (String[] array2:array1) {
            for (String s: array2) {
                    target[count] = s;
                    count++;
            }
            }
            return target;
        }


    public static void main(String[] args) {
       String[] target = abc(new String[]{"one", "two", "three"},
                             new String[]{"four","five","six"});
        for (String s :args) {
            for (int i = 0; i < target.length; i++) {
                if (s.equals(target[i])){
                    target[i] = null;
                }
            }
        }
        for (String s: target) {
            System.out.print(s + " ");
        }
        System.out.println();
        }
    }

