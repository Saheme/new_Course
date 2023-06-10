package edu.javaRushCourse.JavaSyntax.level10.lesson3;

import java.util.Arrays;

/**
 * Амиго и Диего нужно взломать базу данных пиратов и внести туда свои имена. Тем самым выдав себя за пиратов. При этом нужно испортить данные о двух других пиратах.
 *
 * Тебе нужно реализовать два метода. Первый — corruptDB должен найти в БД пару имен, содержащих символ b, и в них заменить все символы b на escape-последовательность \b.
 * Второй метод, addTwoNames, должен изменить БД: она должна стать длиннее на 2, и в конце содержать два новых имени: "Рыжий Амиго" и "Одноглазый Диего".
 *
 * Требования:
 * •	Метод corruptDB должен найти в массиве piratesDB два элемента содержащих символ 'b' и заменить в них все символы 'b' tа '\b'
 * •	Метод addTwoNames должен записать в piratesDB массив на 2 длиннее, с двумя новыми именами в конце.
 */
public class Task205 {
    public static String[] piratesDB = new String[]{
            "Drax",
            "Yondu Udonta",
            "Maz Kanata",
            "キャプテン・ハーロック",
            "Star-Lord",
            "Christopher Summers",
            "Крысс",
            "Весельчак У",
            "Nebula",
            "Rocket",
            "Han Solo",
            "boba Fett"
    };

    public static void main(String[] args) {
        System.out.println(Arrays.toString(piratesDB));

        corruptDB();
        addTwoNames();

        System.out.println(Arrays.toString(piratesDB));
    }

    public static void corruptDB() {
        String[] array2 = Arrays.copyOf(piratesDB, piratesDB.length);
        for (int i = 0; i < array2.length; i++) {
           if (array2[i].contains("b")){
               array2[i] = piratesDB[i].replaceAll("b", "\b");
           }
        }
        piratesDB=array2;

        }





    public static void addTwoNames() {
        String[] array2 = Arrays.copyOf(piratesDB, piratesDB.length+2);
        array2[12] = "Рыжий Амиго";
        array2[13] = "Одноглазый Диего";
        piratesDB = array2;
    }
}


