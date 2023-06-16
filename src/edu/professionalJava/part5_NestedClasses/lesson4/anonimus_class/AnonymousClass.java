package edu.professionalJava.part5_NestedClasses.lesson4.anonimus_class;

public class AnonymousClass {
    public static void main(String[] args) {
        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }

        };
        System.out.println(m.doOperation(4,8));
    }
}

interface Math{
    int doOperation(int a , int b);
}

