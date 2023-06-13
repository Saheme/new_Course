package edu.javaRushCourse.JavaSyntax.level11.lesson6.Task237;

/**
 *Попробуем собрать компьютер. У нас есть классы: системный блок, монитор, клавиатура, мышь.
 *  В классе компьютер в конструкторе создай объекты классов-составляющих компьютера.
 *
 * Требования:
 * •	В отдельных файлах должны быть публичные классы Computer, Keyboard, Monitor, Mouse, SystemUnit.
 * •	В конструкторе класса Computer нужно создать 4 объекта разных "комплектующих".
 */
public class Computer {
    SystemUnit systemUnit = new SystemUnit();
    Monitor monitor = new Monitor();
    Keyboard keyboard = new Keyboard();
    Mouse mouse = new Mouse();
}
