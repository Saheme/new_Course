package edu.javaRushCourse.JavaSyntax.level14.lesson6;

/**
 * В enum Month добавь 4 метода: getWinterMonths(), getSpringMonths(), getSummerMonths(),
 * getAutumnMonths() которые будут возвращать массив с тремя месяцами.
 *
 * Требования:
 * •	Публичный статический метод getWinterMonths() должен возвращать массив с зимними месяцами.
 * •	Публичный статический метод getSpringMonths() должен возвращать массив с весенними месяцами.
 * •	Публичный статический метод getSummerMonths() должен возвращать массив с летними месяцами.
 * •	Публичный статический метод getAutumnMonths() должен возвращать массив с осенними месяцами.
 */
public enum Task322 {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Task322[] getWinterMonths() {
        return new Task322[]{JANUARY, FEBRUARY, DECEMBER};
    }

    public static Task322[] getSpringMonths() {
        return new Task322[]{MARCH, APRIL, MAY};
    }

    public static Task322[] getSummerMonths() {
        return new Task322[]{JUNE, JULY, AUGUST};
    }

    public static Task322[] getAutumnMonths() {
        return new Task322[]{SEPTEMBER, OCTOBER, NOVEMBER};
    }


}
