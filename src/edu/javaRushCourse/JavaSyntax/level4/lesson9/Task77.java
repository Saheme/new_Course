package edu.javaRushCourse.JavaSyntax.level4.lesson9;

/**
 * Наконец Амиго добрался до ядра планеты. Осталось дело за малым — уничтожить зараженных галабагами роботов.
 * Чтобы отобразить в последнем слое уничтоженного робота, используй переменную death вместо bug.
 * <p>
 * Пример вывода:
 * 🌍🌍🌍 🌍🌍🌍🌍🌍🌍
 * 🌍🌍🌍 🌍🌍🌍🌍🌍🌍
 * 🌍🌍🌍 🌍🌍🌍🌍🌍🌍
 * 🌍🌍🌍 🌍🌍🌍🌍🌍🌍
 * 🌍🌍🌍 🌍🌍🌍🌍🌍🌍
 * 🌍🌍🌍 🌍🌍🌍🌍🌍🌍
 * 🌍🌍🌍 🌍🌍🌍🌍🌍🌍
 * 🌍🌍🌍 🌍🌍🌍🌍🌍🌍
 * 🌍🌍🌍 🌍🌍🌍🌍🌍🌍
 * 💀💀💀💀💀💀💀💀💀💀
 * <p>
 * Требования:
 * •	В первых девяти слоях на четвертой позиции должен быть тоннель (переменная hole).
 * •	Амиго не должен находиться ни в каком слое.
 * •	Последний слой должен состоять только из уничтоженных роботов (переменная death).
 */
public class Task77 {
    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";


    public static void main(String[] args) {
        String temp = land;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 9) {
                    land = death;
                }
                if (j == 3 && !(i == 9)) {
                    land = hole;
                }
                System.out.print(land);
                land = temp;
            }
            System.out.println();
        }
    }
}
