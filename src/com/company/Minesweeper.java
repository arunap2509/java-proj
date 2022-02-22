package com.company;

public class Minesweeper {

    private String[][] board;

    Minesweeper(String[][] minesBoard) {
        board = minesBoard;
    }

    public String[][] GetMines() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j].equals(".")) {
                    board[i][j] = GetAdjacentMines(i, j, board.length, board[0].length);
                }
            }
        }
        return board;
    }

    private String GetAdjacentMines(int row, int col, int rowLength, int colLength) {
        int adjacentMines = 0;

        // up
        if (row - 1 >= 0 && board[row-1][col].equals("*")) {
            adjacentMines += 1;
        }

        // down
        if (row + 1 < rowLength && board[row+1][col].equals("*")) {
            adjacentMines += 1;
        }

        // right
        if (col + 1 < colLength && board[row][col+1].equals("*")) {
            adjacentMines += 1;
        }

        // left
        if (col - 1 >= 0 && board[row][col-1].equals("*")) {
            adjacentMines += 1;
        }

        // up-left
        if (col - 1 >= 0 && row - 1 >= 0 && board[row - 1][col - 1].equals("*")) {
            adjacentMines += 1;
        }

        // up-right
        if (col + 1 < colLength && row - 1 >= 0 && board[row -1 ][col + 1].equals("*")) {
            adjacentMines += 1;
        }

        // down-left
        if (col - 1 >= 0 && row + 1 < rowLength && board[row + 1][col - 1].equals("*")) {
            adjacentMines += 1;
        }

        // down-right
        if (col + 1 < colLength && row + 1 < rowLength && board[row + 1][col + 1].equals("*")) {
            adjacentMines += 1;
        }

        return adjacentMines != 0 ? String.valueOf(adjacentMines) : ".";
    }
}
