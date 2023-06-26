package edu.javaRushCourse.JavaSyntax.level9.lesson7.Task191;

/**
 * Чтобы справиться с толпами Диего, давай продублируем корабль с помощью окружающей аномалии и рассадим всех альтернативных Диего по дубликатам кораблей.
 * А чтобы они не сопротивлялись рассаживанию, зашифруем их хеш-суммы, а пароли разместим на дубликатах кораблей.
 * Ни один робот не выдержит существования с зашифрованной хеш-сумой, так что они сами разбредутся по кораблям.
 *
 * В методе dealWithDuplicates нужно:
 *
 * Перезаписать переменную hashSum каждому Диего из массива diegos, используя для этого операцию XOR и какой-нибудь пароль.
 * Создать объект Nimrod и присвоить его переменной password пароль из п.1.
 * Заполнить массив Nimrod[] объектами из п.2 и вернуть его.
 * Требования:
 * •	Нельзя изменять классы Diego и Nimrod.
 * •	Нужно реализовать метод dealWithDuplicates согласно условию.
 */
public class Task191 {
    public static void main(String[] args) {
        Diego[] diegos = new Diego[99];
        for (int i = 0; i < diegos.length; i++) {
            diegos[i] = new Diego();
        }

        System.out.print(diegos[0].hashSum + " ^ ");
        Nimrod[] nimrods = dealWithDuplicates(diegos);
        System.out.println(nimrods[0].password + " = " + diegos[0].hashSum);
    }

    public static Nimrod[] dealWithDuplicates(Diego[] diegos) {
        int[] pass = new int[diegos.length];
        Nimrod[] nimrods = new Nimrod[diegos.length];
        for (int i = 0; i < nimrods.length; i++) {
            pass[i] = Math.abs( (int) (Math.random() * Integer.MAX_VALUE));
            diegos[i].hashSum ^= pass[i];
        }
        for (int i = 0; i < diegos.length; i++) {
            nimrods[i] = new Nimrod();
            nimrods[i].password = pass[i];
        }
        return nimrods;
    }
}
