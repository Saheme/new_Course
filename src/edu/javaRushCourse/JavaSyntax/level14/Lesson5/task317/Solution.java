package edu.javaRushCourse.JavaSyntax.level14.Lesson5.task317;

import java.util.Collections;
import java.util.List;

/**
 * Дорогу к выходу из Инстаматрицы охраняет ядовитая змея. Эта дорога представлена доской между двумя небоскрёбами.
 *
 * В классе Board создан список boardNodes, который в нашем случае будет представлять доску между небоскрёбами.
 *
 * Список заполнен объектами внутреннего класса Node, каждый из которых обозначает часть змеи или доски (так как змея обвивает доску).
 *
 * Твоя задача — в методе clearBoard() класса Solution заменить все объекты Node с частями змеи на объекты Node со словом "board".
 *
 * Метод clearBoard() должен возвращать обновлённый список, очищенный от змеи.
 *
 * В итоге вывод на экран должен содержать 10 слов "board".
 *
 * Метод main не участвует в валидации.
 *
 * Требования:
 * •	Не изменяй класс Board.
 * •	Реализуй метод clearBoard класса Solution согласно условиям.
 */
public class Solution {
    public static void main(String[] args) {
        printList(clearBoard());
    }

    public static List<Board.Node> clearBoard() {
        Board board =new Board();
        List <Board.Node> list = board.getBoardNodes();
        for (Board.Node node : list) {
            Collections.fill(list, new Board.Node("board"));
        }
        return list;
    }

    private static void printList(List<?> list) {
        list.forEach(element -> System.out.print(element + " "));
    }
}
