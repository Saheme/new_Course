package edu.unitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {

    @org.junit.jupiter.api.Test
    void testDogGetNameMethod() {
        Dog dog = new Dog("Bobby", 9);
            assertEquals("Bobby", dog.getName());

    }


    @org.junit.jupiter.api.Test
    void setName() {
    }

    @org.junit.jupiter.api.Test
    void getAge() {
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }
}