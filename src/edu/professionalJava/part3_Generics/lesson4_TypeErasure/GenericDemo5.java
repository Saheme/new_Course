package edu.professionalJava.part3_Generics.lesson4_TypeErasure;

public class GenericDemo5 {
    public static void main(String[] args) {

    }

//    public void abc(Info<String> info){
//        String str = info.getValue();
//    }
    public void abc(Info<Integer> info){
        int num = info.getValue();
    }
}


class Info<T>{
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{ (" +
                "value=" + value +
                ") }";
    }

    public T getValue(){
        return value;
    }
}


class Parent{
    public void abc(Info<String> info){
        String str = info.getValue();
    }
}


class Child extends Parent{
//    public void abc(Info<Integer> info){
//        String str = info.getValue();
//    }
}