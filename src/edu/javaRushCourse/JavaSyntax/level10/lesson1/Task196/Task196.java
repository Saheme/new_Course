package edu.javaRushCourse.JavaSyntax.level10.lesson1.Task196;

import java.util.Arrays;

/**
 * ИИ помнит все, что есть в комнатах корабля. Списки хранятся в статических переменных класса NimrodAi.
 *
 * В методе checkPirates нужно сравнить массив объектов из памяти ИИ корабля с массивом, полученным в результате сканирования комнаты (scanResult).
 * Если в комнате есть лишние объекты (checkPirates вернул true), нужно открыть шлюзы в комнате, очистить помещение и таким образом избавиться от пиратов.
 *
 * Требования:
 * •	Метод getRoomByName должен возвращать ссылку на одну из статических переменных класса NimrodAi, в зависимости от параметра roomName.
 * •	Метод checkPirates должен возвращать true, если при сканировании в комнате обнаружено больше предметов чем должно быть.
 * •	Метод checkPirates должен возвращать true, если при сканировании в комнате обнаружены объекты которые отсутствуют в памяти ИИ.
 * •	Метод checkPirates должен возвращать false, если при сканировании в комнате обнаружены только разрешенные предметы.
 * •	В методе main нужно вызвать метод checkPirates для каждой комнаты корабля.
 * •	В методе main нужно вызвать метод openFloodgates для тех комнат у которых метод checkPirates вернул true.
 */
import java.util.Arrays;

public class Task196 {

    public class NimrodAi {

        public static String[] diningRoom = {
                "button for emergency meeting",
                "table", "table", "table", "table", "table",
                "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench",
                "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench"};
        public static String[] o2 = {"plant", "plant"};
        public static String[] medRoom = {"bed", "bed", "bed", "bed", "SCAN-MO-TRON-2000", "liquid analyser"};
        public static String[] armoury = {"cannon launcher", "chair"};
        public static String[] securityRoom = {"rack", "rack", "table"};
        public static String[] reactor = {};
        public static String[] telecom = {"computer", "computer", "computer", "table", "chair"};
        public static String[] warehouse = {
                "container", "container", "container",
                "box", "box", "box", "box", "box", "box",
                "barrel", "barrel", "barrel", "barrel"};
        public static String[] controlRoom = {"interactive ship map", "chair", "chair", "chair"};
        public static String[] powerRoom = {"power lamp", "power lamp", "power lamp", "power lamp", "power lamp", "power lamp", "power lamp"};

        public static void main(String[] args) {
            //напишите тут ваш код

            checkPirates("securityRoom");
        }

        public static boolean checkPirates(String roomName) {
            String[] room = getRoomByName(roomName);
            if (room == null) {
                return false;
            }

            String[] scanResult = RoomScanner.scanRoom(roomName);
            System.out.printf("В %s обнаружено: %s\n", roomName, Arrays.toString(scanResult));

            //напишите тут ваш код

            return false;
        }

        public static void openFloodgates(String roomName) {
            System.out.printf("ВНИМАНИЕ, открытие шлюзов в %s\n\n", roomName);
            Arrays.fill(getRoomByName(roomName), null);
        }

        public static String[] getRoomByName(String roomName) {
            //напишите тут ваш код

            return null;
        }
    }
}
