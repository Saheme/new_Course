package edu.professionalJava.part3_Generics.lesson2_ParameterizedClass;

public class GenericDemo3 {
    public static void main(String[] args) {
        Pair<String,Integer> pair1 = new Pair<>("Vasily",25);
        System.out.println(pair1.getVal1() + " " + pair1.getVal2());
        Pair<Double,Integer> pair2 = new Pair<>(314.58,25);
        System.out.println(pair2.getVal1() + " " + pair2.getVal2());
    }
}

class Pair<V1,V2>{
    private V1 val1;
    private V2 val2;

    public Pair(V1 val1, V2 val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public V1 getVal1() {
        return val1;
    }

    public V2 getVal2() {
        return val2;
    }
}