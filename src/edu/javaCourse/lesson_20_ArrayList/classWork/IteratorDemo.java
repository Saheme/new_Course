package edu.javaCourse.lesson_20_ArrayList.classWork;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        String s = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList<String> list = new ArrayList<>();
        list.add(s3);
        list.add(s);
        list.add(s4);
        list.add(s2);

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            it.next();
            it.remove();

        }

    }
}
