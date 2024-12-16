package tictactoe;

import tictactoe.controllers.GameController;
import tictactoe.models.Game;
import tictactoe.models.enums.GameState;

public class Client {
    public static void main(String[] args){
        GameController gameController = new GameController();



        gameController.startGame();

        while(gameController.gameState().equals(GameState.IN_PROGRESS)){
            gameController.display();
            gameController.makeMove();
        }

        if(gameController.gameState().equals(GameState.SUCCESS)){
            System.out.println("Winner of the game - " +gameController.getWinner().getName());
        }
        else if(gameController.gameState().equals(GameState.DRAW)){
            System.out.println("Game is drawn");
        }
    }

}
