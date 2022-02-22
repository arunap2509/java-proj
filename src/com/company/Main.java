package com.company;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//         RnaTranscription transcription = new RnaTranscription();
//         String response = transcription.GetRnaStrand("GCTAAAA");
//         System.out.println(response);

//        int score = Yacht.GetScore(new int[] {3, 1, 3, 2, 2},
//                YachtCategory.Threes);
//        System.out.println(score);

//           String[][] board = new String[][]
//                   {
//                           {".", "*", ".", "*", "."},
//                           {".", ".", "*", ".", "."},
//                           {".", ".", "*", ".", "."},
//                           {".", ".", ".", ".", "."}
//                   };
//
//           Minesweeper minesweeper = new Minesweeper(board);
//           String[][] response = minesweeper.GetMines();
//
//        for (String[] strings : response) {
//            for (int j = 0; j < response[0].length; j++) {
//                System.out.print(strings[j] + " ");
//            }
//            System.out.println();

            List<String> board = Arrays.asList(
                    " * * ",
                    "  *  ",
                    "  *  ",
                    "     "
            );
            List<String> singleBoard = Collections.singletonList("*   *");
            MinesweeperBoard minesweeperBoard = new MinesweeperBoard(board);
            List<String> response = minesweeperBoard.withNumbers();

            for (String row : response) {
                for (int col = 0; col < row.length(); col++) {
                    System.out.print(row.charAt(col) + " ");
                }
                System.out.println();
            }
    }
}
