package edu.javaRushCourse.JavaSyntax.level7.lesson6;

import java.util.Scanner;

/**
 * В этой (первой) части нужно в класс Solution добавить публичную статическую переменную (поле) diabloPosition типа int, в которой будет храниться позиция Диабло.
 * В методе main присвой этой переменной случайное значение от 1 до 4. Для этого воспользуйся уже реализованным методом getRandomNumber(int), передав в него верхнюю
 * границу диапазона — число 4.
 * Далее в классе Solution создай публичный статический метод void findDiablo(), в котором сначала выведи на экран значение переменной getFirstPositionPhrase,
 * а потом считывай с клавиатуры числа до тех пор, пока не будет угадана позиция Диабло. При этом если позиция не угадана, то выведи фразу — значение переменной
 * getPositionPhrase, а если угадали, то значение переменной findDiabloPhrase. Вызови метод findDiablo в методе main после присвоения значения переменной diabloPosition.
 *
 * Требования:
 * •	В классе Solution должна быть публичная статическая переменная diabloPosition типа int.
 * •	В методе main класса Solution переменной diabloPosition должно быть присвоено значение - результат работы метода getRandomInt с аргументом 4.
 * •	В классе Solution должен быть публичный статический метод void findDiablo().
 * •	Вызов метода findDiablo() должен считывать значения с клавиатуры до тех пор, пока не будет введено значение равное значению переменной diabloPosition.
 * •	Метод findDiablo() класса Solution должен выводить в консоль значения переменных getFirstPositionPhrase, getPositionPhrase и findDiabloPhrase.
 * •	В методе main класса Solution должен быть вызван метод findDiablo().
 */
public class Task136 {
    public static String getFirstPositionPhrase = "Помоги Амиго определить, где спрятался Диабло? Введи номер позиции (1, 2, 3 или 4):";
    public static String getPositionPhrase = "Диабло не обнаружен. Давай попробуем снова. Введи номер позиции (1, 2, 3 или 4):";
    public static String findDiabloPhrase = "Амиго обнаружил Диабло.";
    public static String diabloDefendPhrase = "Амиго атакует. Диабло отбил атаку Амиго и нанес ответный удар.";
    public static String amigoAttackPhrase = "Удар Амиго достиг цели. Диабло потерял 3 жизни.";
    public static String winPhrase = "Амиго одержал победу над Диабло и выбил из его головы загадочный кристалл.";
    public static String loosePhrase = "Диабло победил Амиго.";
    public static int diabloPosition;
    public static void findDiablo(){
        System.out.println(getFirstPositionPhrase);
        boolean isExit = false;
        Scanner scan = new Scanner(System.in);
        while (!isExit){
            int place = scan.nextInt();
            if (place==diabloPosition){
                System.out.println(findDiabloPhrase);
                isExit=true;
            }else {
                System.out.println(getPositionPhrase );
            }}
    }

    public static void main(String[] args) {
        Task136.diabloPosition = getRandomNumber(4);

        findDiablo();
    }

    public static int getRandomNumber(int range) {
        return (int) (Math.random() * range) + 1;
    }
}
