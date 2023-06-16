package edu.professionalJava.part3_Generics.lesson2_ParameterizedClass;

public class GenericDemo2 {
    public static void main(String[] args) {
        Info<String> info = new Info<>("I'm a beast");
        System.out.println(info);
        Info<Integer> num = new Info<>(256);
        System.out.println(num);
        Integer a = num.getValue();
        System.out.println(a);


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
