package edu.javaRushCourse.JavaSyntax.level12.lesson2.Task242;

/**
 * Для робозомби-погрузчиков была создана новая песня ультраметала, которая поможет нам наладить процесс упаковки грузов для планеты Лулг.
 *
 * Для проигрывания песни нам нужны класс UltraMetal и массив lyrics класса Solution.
 * В данный момент песня запускается через создание нового объекта Solution(). Требуется переписать задачу,
 * чтобы песня запускалась без использования дополнительного объекта Solution().
 *
 * Твоя задача:
 *
 * Добавить одно ключевое слово static в классе Solution.
 * Убрать создание объекта класса Solution из метода main.
 * При этом работа программы не должна измениться, и в консоли три раза должна выводиться строка из песни, как до, так и после требуемых изменений.
 *
 * Требования:
 * •	Не изменяй класс UltraMetal.
 * •	Не изменяй и не добавляй элементы в массиве lyrics класса Solution.
 * •	В классе Solution нужно добавить одно ключевое слово static.
 * •	В методе main не должен создаваться объект класса Solution.
 */
public class Solution {
    public static final String[] lyrics = {"Du...", "Du hast...", "Du hast ultra metal"};

    public static void main(String[] args) {
        Solution solution = new Solution();

       UltraMetal ultraMetal = new UltraMetal();
        ultraMetal.playUltraMetal(lyrics[0], lyrics[1], lyrics[2]);
    }
}
