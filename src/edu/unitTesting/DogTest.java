package edu.unitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {

    @org.junit.jupiter.api.Test
    void testDogGetNameMethod() {
        Dog dog = new Dog("Bobby", 9); // новый объект для тестирования
            assertEquals("Bobby", dog.getName()); // метод принимает ожидаемое значение и действительное

    }


    @org.junit.jupiter.api.Test
    void TestSetDogNameMethod() {
        Dog dog = new Dog("Booby", 10);
        dog.setName("Dummy");
        assertEquals("Booby", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void TestSetDogNameMethodIfEmpty() {
        Dog dog = new Dog("", 10);
        dog.setName("Dummy");
        assertEquals("Dummy", dog.getName());
    }


    @org.junit.jupiter.api.Test
    void getAge() {
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }
}