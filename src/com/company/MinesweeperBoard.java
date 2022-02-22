package com.company;

import java.util.Collections;
import java.util.List;

public class MinesweeperBoard {

    private List<String> board;

    MinesweeperBoard(List<String> inputBoard) {
        board = inputBoard;
    }

    public List<String> withNumbers() {
        for (int row = 0; row < board.size(); row++) {
            String current = board.get(row);
            for (int col = 0; col < board.get(row).length(); col++) {
                if (board.get(row).charAt(col) == ' ') {
                    String adjacentMines = GetAdjacentMines(row, col, board.size(), board.get(row).length());
                    current = current.substring(0, col) + adjacentMines + current.substring(col + 1);

                    if (board.size() == 1) {
                        board = Collections.singletonList(current);
                    } else {
                        board.set(row, current);
                    }
                }
            }

        }

        return board;
    }

    private String GetAdjacentMines(int row, int col, int rowLength, int colLength) {
        int adjacentMines = 0;

        // up
        if (row - 1 >= 0 && board.get(row-1).charAt(col) == '*') {
            adjacentMines += 1;
        }

        // down
        if (row + 1 < rowLength && board.get(row+1).charAt(col) == '*') {
            adjacentMines += 1;
        }

        // right
        if (col + 1 < colLength && board.get(row).charAt(col+1) == '*') {
            adjacentMines += 1;
        }

        // left
        if (col - 1 >= 0 && board.get(row).charAt(col-1) == '*') {
            adjacentMines += 1;
        }

        // up-left
        if (col - 1 >= 0 && row - 1 >= 0 && board.get(row -1).charAt(col-1) == '*') {
            adjacentMines += 1;
        }

        // up-right
        if (col + 1 < colLength && row - 1 >= 0 && board.get(row-1).charAt(col+1) == '*') {
            adjacentMines += 1;
        }

        // down-left
        if (col - 1 >= 0 && row + 1 < rowLength && board.get(row+1).charAt(col-1) == '*') {
            adjacentMines += 1;
        }

        // down-right
        if (col + 1 < colLength && row + 1 < rowLength && board.get(row+1).charAt(col+1) == '*') {
            adjacentMines += 1;
        }

        return adjacentMines != 0 ? String.valueOf(adjacentMines) : " ";
    }
}
