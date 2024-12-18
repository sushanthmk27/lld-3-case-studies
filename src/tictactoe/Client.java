package tictactoe;

import tictactoe.controllers.GameController;
import tictactoe.models.Bot;
import tictactoe.models.Game;
import tictactoe.models.HumanPlayer;
import tictactoe.models.Player;
import tictactoe.models.enums.GameState;
import tictactoe.strategy.WinnerStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args){
        GameController gameController = new GameController();

        List<Player> playerList = new ArrayList<>();
        playerList.add(new HumanPlayer());
        playerList.add(new Bot());

        int size = 3;       // board size

        List<WinnerStrategy> winnerStrategyList = new ArrayList<>();

        gameController.startGame(size, playerList, winnerStrategyList);

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
