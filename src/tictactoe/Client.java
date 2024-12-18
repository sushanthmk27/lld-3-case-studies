package tictactoe;

import tictactoe.controllers.GameController;
import tictactoe.models.*;
import tictactoe.models.enums.BotDifficultyLevel;
import tictactoe.models.enums.GameState;
import tictactoe.strategy.WinnerStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args){
        GameController gameController = new GameController();

        List<Player> playerList = new ArrayList<>();
        playerList.add(new HumanPlayer(1, "Sushanth", new Symbol('X')));
        playerList.add(new Bot(2, "Default Bot", BotDifficultyLevel.EASY, new Symbol('O')));

        int size = 3;       // board size

        List<WinnerStrategy> winnerStrategyList = new ArrayList<>();

        Game game = gameController.startGame(size, playerList, winnerStrategyList);

        while(gameController.gameState(game).equals(GameState.IN_PROGRESS)){
            gameController.display(game);
            gameController.makeMove(game);
        }

        if(gameController.gameState(game).equals(GameState.SUCCESS)){
            System.out.println("Winner of the game - " +gameController.getWinner(game).getName());
        }
        else if(gameController.gameState(game).equals(GameState.DRAW)){
            System.out.println("Game is drawn");
        }
    }

}
