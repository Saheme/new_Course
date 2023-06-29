package edu.javaRushCourse.JavaSyntax.level14.Lesson5.classWork;

public class MyLinkedList {
    private Node head;
    private int size;

    public void add(String value){
        if (head==null){
            this.head = new Node(value);
        }else {
            Node temp = head;
            while (temp.getNext()!=null){
                temp= temp.getNext();
            }
        }
            size++;
    }



    private static class Node{
        private String value;
        private Node next;

        public Node(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
