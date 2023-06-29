package edu.javaRushCourse.JavaSyntax.level14.Lesson5.task317;

import java.util.List;

public class SolutionAnswer {
    public static void main(String[] args) {
        printList(clearBoard());
    }

    public static List<Board.Node> clearBoard() {
        Board board = new Board();
        List<Board.Node> boardNodes = board.getBoardNodes();

        for (Board.Node node : boardNodes) {
            String data = node.getData();
            boolean isSnake = data.startsWith("snake");
            if (isSnake) {
                node.setData("board");
            }
        }
        return boardNodes;
    }

    private static void printList(List<?> list) {
        list.forEach(element -> System.out.print(element + " "));
    }
}
