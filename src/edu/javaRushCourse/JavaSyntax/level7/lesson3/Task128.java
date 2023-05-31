package edu.javaRushCourse.JavaSyntax.level7.lesson3;

/**
 * Давай напишем реализацию калькулятора, который будет считать степени чисел.
 * Для этого создай метод cube(). В качестве аргумента он должен принимать целочисленное значение типа long.
 * Метод должен возводить полученное значение в третью степень и возвращать его как результат работы метода.
 * Числа, которыми придется оперировать, могут быть большими. Поэтому метод cube() должен возвращать тип long.
 *
 * Требования:
 * •	Должен быть создан метод public static long cube(long).
 * •	Метод cube() должен возвращать результат возведения переданного ему числа в третью степень.
 */
public class Task128 {
    public static void main(String[] args) {
        long result = cube(3);
        System.out.println(result);

    }
    public static long cube(long a){
        return (long) Math.pow(a,3);
    }
}
