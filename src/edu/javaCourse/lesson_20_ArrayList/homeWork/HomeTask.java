package edu.javaCourse.lesson_20_ArrayList.homeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HomeTask {
    public static ArrayList<String> abc(String... str) {
        List<String> list = Arrays.asList(str);
        for (int i = 0; i < list.size(); i++) {
            if (str.equals(str)) {
                list.remove(str);
            }
            Collections.sort(list);
        }
        return (ArrayList<String>) list;
    }

    public static void main(String[] args) {


        for (String line:abc("one","two","three")) {
            System.out.println(line + " ");
        }
    }

}

