package com.HuskyParty;

public class Game {
    private Board board = new Board();

    public void printBoard() {
        board.printBoard();
    }

    public void moveX(int row, int col) {

        if (isValidMove(row, col)) {
            board.fillSpot(row, col, 'x');
        }

        if (!board.gameStatus().equals("In Progress"))
            System.out.println(board.gameStatus());
    }

    public void moveO(int row, int col) {

        if (isValidMove(row, col)) {
            board.fillSpot(row, col, 'o');
        }

        if (!board.gameStatus().equals("In Progress"))
            System.out.println(board.gameStatus());
    }

    public boolean isValidMove(int row, int col) {

        return (board.getSpot(row, col) == ' ') && (board.gameStatus().equals("In Progress"));
    }

    public void gameStatus() {
        System.out.println(board.gameStatus());
    }

    public void resetBoard() {
        board = new Board();
    }

}


