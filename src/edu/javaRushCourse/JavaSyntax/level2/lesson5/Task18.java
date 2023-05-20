package edu.javaRushCourse.JavaSyntax.level2.lesson5;

/**
 * В методе main(String[]) объяви переменные name, date, time, noun, adjective и verb типа String, присвой им разные значения,
 * чтобы сформировать позитивную новость для планеты Айтинии.
 * Команды вывода в консоль не менять.
 * <p>
 * Требования:
 * •	В методе main объяви шесть переменных типа String.
 * •	Имена переменных должны быть name, date, time, noun, adjective и verb.
 * •	Переменным сразу должны быть присвоены значения.
 * •	Все переменные должны иметь разные значения.
 * •	Команды вывода в консоль не менять.
 */
public class Task18 {
    public static void main(String[] args) {
        String name = "Наш призидент", date = "сегодня", time = "утром", adjective = "зомбо -", noun = "ящик", verb = "вливающий в мозг";

        System.out.println("Новости:");
        System.out.println(name + " " + date + " " + time + " изобрел " + adjective + " " + noun + " который " + verb + " террабайты данных в минуту.");
    }
}
