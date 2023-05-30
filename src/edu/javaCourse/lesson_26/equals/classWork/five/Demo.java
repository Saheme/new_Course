package edu.javaCourse.lesson_26.equals.classWork.five;

public class Demo {
    public static void main(String[] args) {
       // Animal an = new Animal();
      //  Mammal mam = new Mammal();
        Lion lion = new Lion();
    }

}

class Animal{
    public Animal() {
        System.out.println("Constructor of Animal");
    }
    static {
        System.out.println("Static initializer block is Animal ");
    }

    {
        System.out.println("NON-Static initializer block is Animal");
    }
}

class Mammal extends Animal{
    public Mammal() {
        System.out.println("Constructor of Mammal");
    }
    static {
        System.out.println("Static initializer block is Mammal ");
    }

    {
        System.out.println("NON-Static initializer block is Mammal");
    }
}

class Lion extends Mammal {
    public Lion() {
        System.out.println("Constructor of Lion");
    }
    static {
        System.out.println("Static initializer block is Lion ");
    }

    {
        System.out.println("NON-Static initializer block is Lion");
    }
}
