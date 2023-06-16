package edu.javaRushCourse.JavaSyntax.level13.lesson1;

/**
 *
 В классе Solution представлены 8 объектов-оберток примитивных типов с именами вида типValueBox.
 Для каждого из этих объектов-оберток необходимо создать переменные соответствующего примитивного типа и присвоить им имена вида типValue.
 Для создания переменной используй метод объекта-обертки типValueBox.примитивValue().

 Пример переменной примитивного типа: int intValue = ....;

 Требования:
 •	В классе Solution должны быть 8 объектов типа класс-обертка примитивного типа с именами вида типValueBox.
 •	В классе Solution должны быть 8 переменных примитивных типов данных с именами вида типValue.
 •	При создании переменных примитивных типов должны использоваться существующие объекты-обертки и метод типValueBox.примитивValue().
 */
public class Task272 {
    Byte byteValueBox;
    byte byteValue = byteValueBox.byteValue();
    Short shortValueBox;
    short shortValue = shortValueBox.shortValue();
    Integer integerValueBox;
    int intValue = integerValueBox.intValue();
    Long longValueBox;
    long longValue = longValueBox.longValue();

    Float floatValueBox;
    float floatValue = floatValueBox.floatValue();
    Double doubleValueBox;
    double doubleValue = doubleValueBox.doubleValue();

    Character characterValueBox;
    char charValue = characterValueBox.charValue();
    Boolean booleanValueBox;
    boolean booleanValue = booleanValueBox.booleanValue();


}
