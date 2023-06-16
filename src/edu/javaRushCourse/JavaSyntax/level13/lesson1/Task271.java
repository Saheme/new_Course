package edu.javaRushCourse.JavaSyntax.level13.lesson1;

/**
 * В классе Solution представлены 8 переменных примитивных типов с именами вида типValue.
 * Для каждой из этих переменных необходимо создать объекты-обертки и присвоить им имена вида типValueBox.
 * Для создания объектов-оберток используй метод Тип.valueOf(примитив).
 *
 * Пример переменной объекта-обертки: Integer integerValueBox = ....;
 *
 * Требования:
 * •	В классе Solution должны быть 8 переменных примитивных типов данных с именами вида типValue.
 * •	В классе Solution должны быть 8 объектов типа класс-обертка примитивного типа с именами вида типValueBox.
 * •	При создании объектов-оберток должны использоваться существующие переменные примитивных типов и метод Тип.valueOf(примитив).
 */
public class Task271 {
    byte byteValue;
    Byte byteValueBox = Byte.valueOf(byteValue);
    short shortValue;
    Short shortValueBox = Short.valueOf(shortValue);
    int intValue;
    Integer integerValueBox = Integer.valueOf(intValue);
    long longValue;
    Long longValueBox = Long.valueOf(longValue);

    float floatValue;
    Float floatValueBox = Float.valueOf(floatValue);
    double doubleValue;
    Double doubleValueBox = Double.valueOf(doubleValue);

    char charValue;
    Character characterValueBox = Character.valueOf(charValue);
    boolean booleanValue;
    Boolean booleanValueBox = Boolean.valueOf(booleanValue);
}
