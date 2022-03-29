package com.HuskyParty;

public class Main {

    public static void main(String[] args) {
	// write your code here
        demo();
    }

    public static void demo() {
        Game game = new Game();

        System.out.println("----O Wins----\n");
        game.moveO(0,0);
        game.moveO(0,1);
        game.moveO(0,2);
        game.printBoard();
        game.resetBoard();

        game.moveO(0,1);
        game.moveO(1,1);
        game.moveO(2,1);
        game.printBoard();
        game.resetBoard();

        game.moveO(0,0);
        game.moveO(1,1);
        game.moveO(2,2);
        game.printBoard();
        game.resetBoard();

        System.out.println("\n----X Wins----\n");
        game.moveX(0,0);
        game.moveX(0,1);
        game.moveX(0,2);
        game.printBoard();
        game.resetBoard();

        game.moveX(0,1);
        game.moveX(1,1);
        game.moveX(2,1);
        game.printBoard();
        game.resetBoard();

        game.moveX(0,0);
        game.moveX(1,1);
        game.moveX(2,2);
        game.printBoard();
        game.resetBoard();

        System.out.println("\n----Draw----\n");
        game.moveX(0,0);
        game.moveO(0,1);
        game.moveX(0,2);


        game.moveX(1,0);
        game.moveO(1,1);
        game.moveX(1,2);


        game.moveO(2,0);
        game.moveX(2,1);
        game.moveO(2,2);
        game.printBoard();

    }
}
