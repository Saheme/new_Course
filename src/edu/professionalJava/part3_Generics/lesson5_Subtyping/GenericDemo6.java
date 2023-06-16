package edu.professionalJava.part3_Generics.lesson5_Subtyping;

import java.util.ArrayList;

public class GenericDemo6 {
    public static void main(String[] args) {
        X x = new Y();

        //не сработает - типы должны совпадать
//        List<Number> list = new ArrayList<Integer>();
//        list.add(25);
//        list.add(2.5);
//        list.add(7.5);

    }

    // так можно
    Info<Integer> info = new Info<>(25);
    // так нельзя
    //Info<String> info1 = new Info<>("dsdfsd");
}

class X {

}

class Y extends X {

}

//если надо чтобы значения в Generic были только цифры то  надо в параметре типа - наследоваться от Number
class Info<T extends Number> {
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

    class GenMethod {

        public static <T extends Number> T getSecondEllement(ArrayList<T> list) {
            return list.get(1);
        }
    }
}
