package com.HuskyParty;


public class Board {
    private final char[][] board = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};

    public void fillSpot(int row, int col, char player) {
        board[row][col] = player;
    }

    public char getSpot(int row, int col) {
        return board[row][col];
    }

    public String gameStatus() {
        boolean emptySpot = false;

        //Check vertical and horizontal for win
        for (int i = 0; i < board.length; i++) {

            if (board[i][0] == 'x' && board[i][1] == 'x' && board[i][2] == 'x')
                return "X Won";

            if (board[0][i] == 'x' && board[1][i] == 'x' && board[2][i] == 'x')
                return "X Won";

            if (board[i][0] == 'o' && board[i][1] == 'o' && board[i][2] == 'o')
                return "O Won";

            if (board[0][i] == 'o' && board[1][i] == 'o' && board[2][i] == 'o')
                return "0 Won";

        }

        //Check diagonals
        if (board[0][0] == 'x' && board[1][1] == 'x' && board[2][2] == 'x')
            return "X Won";

        if (board[0][2] == 'x' && board[1][1] == 'x' && board[2][0] == 'x')
            return "X Won";

        if (board[0][0] == 'o' && board[1][1] == 'o' && board[2][2] == 'o')
            return "O Won";

        if (board[0][2] == 'o' && board[1][1] == 'o' && board[2][0] == 'o')
            return "O Won";

        //check if draw
        for (char[] chars : board) {
            for (int j = 0; j < board.length; j++) {
                if (chars[j] == ' ') {
                    emptySpot = true;
                    break;
                }
            }
        }
        if (!emptySpot)
            return "Draw";

        return "In Progress";
    }

    public void printBoard() {
        System.out.println( board[0][0] + " | " + board[0][1] + " | " + board[0][2] );
        System.out.println("--|---|--");
        System.out.println( board[1][0] + " | " + board[1][1] + " | " + board[1][2] );
        System.out.println("--|---|--");
        System.out.println( board[2][0] + " | " + board[2][1] + " | " + board[2][2] );
    }
}
