package edu.javaRushCourse.JavaSyntax.level14.lesson7;

/**
 * В классе Solution есть метод getShapeNameByCountOfCorners(int), который возвращает название многоугольника
 * в зависимости от количества углов. Твоя задача — переписать метод, используя только оператор switch.
 * Требования:
 * •	Результат работы метода getShapeNameByCountOfCorners(int) не должен измениться.
 * •	В методе getShapeNameByCountOfCorners(int) должен использоваться только оператор switch.
 */
public class Task326 {
    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

    public static String getShapeNameByCountOfCorners(int countOfCorner) {
        return switch (countOfCorner) {
            case 3 -> "Треугольник";
            case 4 -> "Четырехугольник";
            case 5 -> "Пятиугольник";
            case 6 -> "Шестиугольник";
            case 7 -> "Семиугольник";
            case 8 -> "Восьмиугольник";
            default -> "Другая фигура";
        };
    }
}

