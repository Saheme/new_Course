package edu.javaRushCourse.JavaSyntax.level7.lesson3;

/**
 * Мертвецы окружили Замок Чернобайта! Помоги Амиго уничтожить мертвецов.
 *
 * Создай метод String destroyDeadMan(String), который будет принимать на вход "имя" мертвеца и возвращать фразу "<имя> был уничтожен",
 * где <имя> — значение аргумента метода destroyDeadMan.
 * В методе main вызови метод destroyDeadMan(String) для каждого мертвеца из списка deadMen, результат вызова выведи на экран.
 *
 * Требования:
 * •	В классе Solution должна быть публичная статическая переменная String[] deadMen, проинициализированная при объявлении.
 * •	В классе Solution должен быть создан public static метод destroyDeadMan() с параметром типа String и возвращаемым значением типа String.
 * •	Вызов метода destroyDeadMan(String) должен возвращать строку согласно условию.
 * •	В методе main должен быть вызван метод destroyDeadMan(String) для каждого элемента массива deadMen с выводом результата на экран.
 */
public class Task125 {
    public static String[] deadMen = {"мертвец_1", "мертвец_2", "мертвец_3", "мертвец_4", "мертвец_5",
            "мертвец_6", "мертвец_7", "мертвец_8", "мертвец_9", "мертвец_10"};

    public static void main(String[] args) {
        for (int i = 0; i < deadMen.length; i++) {
            String result = deadMen(deadMen[i]);

            System.out.println(result);
        }
    }

    public  static String deadMen(String name){
        return name + " был уничтожен";
    }
}
