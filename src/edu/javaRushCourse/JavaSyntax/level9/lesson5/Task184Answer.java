package edu.javaRushCourse.JavaSyntax.level9.lesson5;

/**
 * Аномалия оцифровала корабль и теперь переполняет его цифровую структуру множеством лишних нулей и единиц, от чего он растягивается.
 * Чтобы стабилизировать ситуацию и стянуть корабль назад, нужен удобный инструмент, позволяющий устанавливать нужный бит числа в 0 либо 1.
 * <p>
 * Для удобства будем изображать числа в двоичной форме. Для этого в начале числа ставим префикс 0b. Например:
 * двоичная запись числа 3: 0b11
 * двоичная запись числа 666: 0b1010011010
 * <p>
 * Бит, который нужно установить, будем отображать таким же способом, но число будет содержать только одну 1. Например:
 * второй бит: 0b10
 * пятый бит: 0b10000
 * <p>
 * Реализуй метод changeBit(int number, int bit, boolean activate).
 * Если аргумент activate равен true, то нужно в числе number установить бит bit в 1, и вернуть получившееся число.
 * Если же activate равен false, то бит bit установить в 0.
 * <p>
 * В реализации тебе будут полезны операторы: |, &, ~.
 * <p>
 * Требования:
 * •	Метод changeBit() должен вернуть число с нужным битом установленным в 1, если activate равен true.
 * •	Метод changeBit() должен вернуть число с нужным битом установленным в 0, если activate равен false.
 */
public class Task184Answer {
    public static void main(String[] args) {
        System.out.println(changeBit(0b101, 0b10, true)); // 111 (7)
        System.out.println(changeBit(0b110, 0b1, true)); // 111 (7)
        System.out.println(changeBit(0b1001, 0b1000, true)); // 1001 (9)

        System.out.println(changeBit(0b10011, 0b10000, false)); // 11 (3)
        System.out.println(changeBit(0b111111, 0b100, false)); // 111011 (59)
        System.out.println(changeBit(0b10101010, 0b100000, false)); // 10001010 (138)
    }

    public static int changeBit(int number, int bit, boolean activate) {
        if (activate) {
            return number | bit;
        } else {

            return number & ~bit;
        }
    }
}
