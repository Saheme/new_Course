package edu.javaCourse.lesson_22.encapsulation.homeWork.second;

/**
 * Создайте класс Animal.при вызове его конструктора пусть на экран выводится "I'm an animal." В классе пусть будет переменная eyes
 * , характеризующая количество глаз. Методы eat(выводящий на экран : "Animal eats") и drink (выводящий на экран : "Animal drinks").
 *      Создайте класс Pet, который является наследником Animal.При вызове его конструктора пусть выводится "I'm pet." и переменной eyes
 * передается значение 2.В классе пусть будут переменные  name , tail, характеризующая количество хвостов и равное 1;
 * paw , характеризующая количество лап и равная 4; Методы run (выводящий на экран : "Pet runs") и jumps (выводящий на экран : "Pet jumps")
 *      Создайте класс Dog, который является наследником Pet.При вызове его конструктора с параметромкоторый будет передавать имя
 * пусть выводится "I'm a dog my name is : " + имя питомца.В класс добавте метод play (выводящий на экран : "Dog plays.")
 *      Создайте класс Cat, который является наследником Pet.При вызове его конструктора с параметромкоторый будет передавать имя
 *  * пусть выводится "I'm a cat my name is : " + имя питомца.В класс добавте метод sleep (выводящий на экран : "Cat sleeps.")
 *      Создайте класс Test, в методе main которого выведите на экран количество лап объекта Dog и вызовите метод sleep объекта класса Cat
 */
public class Test {
    public static void main(String[] args) {
        Dog dog =new Dog("Shark");
        Cat cat = new Cat("Murz");
        System.out.println("Dog has : " + dog.paw + " pow");
        cat.sleep();
    }
}
