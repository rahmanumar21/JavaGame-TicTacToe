package com.game;

import java.util.ArrayList;

public class Board {

    // count variable
    int count = 0;

    // create an ArrayList
    ArrayList<String> board = new ArrayList<>();

    // add elements to the board ArrayList
    void addElements() {
        for (int i = 0; i < 9; i++) {
            board.add(" ");
        }
    }

    // print element of the board
    void printBoard() {

        System.out.println(" " + board.get(0) + " | " + board.get(1) + " | " + board.get(2));
        System.out.println(" " + board.get(3) + " | " + board.get(4) + " | " + board.get(5));
        System.out.println(" " + board.get(6) + " | " + board.get(7) + " | " + board.get(8));

    }

    // update board
    boolean updateBoard(int position, String type) {

        boolean returnValue;

        // if a player selects position n, n-1 index should be updated
        // if the position is not already filled, update the board
        if (board.get(position - 1).equals(" ")) {
            board.set(position - 1, type);

            count += 1;

            returnValue = true;
        }

        // if the position is already filled, ask user to select another position
        else {
            System.out.println("Position already selected. Select another position.");
            returnValue = false;
        }

        return returnValue;

    }

    // if all fields are selected and there is no winner, it's draw
    // returning true if it's draw
    boolean checkDraw() {

        // check if count == 9
        if (count == 9) {
            return true;
        } else {
            return false;
        }
    }

    // if three symbols appears in a row, returning true
    boolean checkWinner(String type) {
        if ((board.get(0).equals(type) && board.get(1).equals(type) && board.get(2).equals(type))
                || (board.get(3).equals(type) && board.get(4).equals(type) && board.get(5).equals(type))
                || (board.get(6).equals(type) && board.get(7).equals(type) && board.get(8).equals(type))
                || (board.get(0).equals(type) && board.get(3).equals(type) && board.get(6).equals(type))
                || (board.get(1).equals(type) && board.get(4).equals(type) && board.get(7).equals(type))
                || (board.get(2).equals(type) && board.get(5).equals(type) && board.get(8).equals(type))
                || (board.get(0).equals(type) && board.get(4).equals(type) && board.get(8).equals(type))
                || (board.get(2).equals(type) && board.get(4).equals(type) && board.get(6).equals(type))) {
            return true;
        }

        else {
            return false;
        }

    }
}
