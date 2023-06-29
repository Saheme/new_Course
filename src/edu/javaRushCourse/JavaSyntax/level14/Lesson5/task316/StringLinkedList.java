package edu.javaRushCourse.JavaSyntax.level14.Lesson5.task316;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void add(String value) {
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public String get(int index) {
        Node temp = first;
        int size = 0;
        while (temp.next != null) {
            temp = temp.next;
            size++;
            if (size == index) {

                return temp.value;
            } else {
            }

        }
                return null;
    }


    public static class Node {
        private Node prev;
        private String value;
        private Node next;


    }
}
