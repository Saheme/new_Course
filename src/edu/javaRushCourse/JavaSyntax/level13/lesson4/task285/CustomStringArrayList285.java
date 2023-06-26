package edu.javaRushCourse.JavaSyntax.level13.lesson4.task285;

import java.util.Arrays;

public class CustomStringArrayList285 {
    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList285() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        capacity = (int) (capacity * 1.5);
        elements = Arrays.copyOf(elements, capacity);

    }
}
