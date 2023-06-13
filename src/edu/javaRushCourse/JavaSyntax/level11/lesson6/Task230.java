package edu.javaRushCourse.JavaSyntax.level11.lesson6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 *
 Рассмотрим аналог памяти компьютера на примере массива строк. Если удалить некоторые элементы,
 то в массиве появятся так называемые "дыры" - то есть элементы равные null. Метод executeDefragmentation(String[]),
 принимающий массив строк, выполняет его "дефрагментацию", то есть перемещает все объекты в начало массива в таком же порядке,
 передвинув все "дыры" (элементы равные null) в конец массива. В этой задаче тебе нужно реализовать метод executeDefragmentation(String[]).
 Метод main() можешь использовать для проверки результата работы метода executeDefragmentation(String[]).

 Требования:
 •	В классе Memory должен быть метод public static void executeDefragmentation(String[]).
 •	Реализуй метод executeDefragmentation(String[]) согласно условию.
 */
public class Task230 {
    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        String[] array2 = new String[array.length];
        int count =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=null){
                array2[count]=array[i];
                count++;
            }else
            continue;
        }
        for (int i = 0; i < array.length; i++) {
            array[i]=array2[i];
        }


    }
}
