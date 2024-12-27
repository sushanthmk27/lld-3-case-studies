package tictactoe.controllers;

import tictactoe.models.Game;
import tictactoe.models.Player;
import tictactoe.models.enums.GameState;
import tictactoe.strategy.WinnerStrategy;

import java.util.List;

public class GameController {

    public Game startGame(int size, List<Player> playerList, List<WinnerStrategy> winnerStrategyList){
        return Game
                .getBuilderInstance()
                .setSize(size)
                .setPlayersList(playerList)
                .setWinnerStrategy(winnerStrategyList)
                .build();
    }

    public GameState gameState(Game game){
        return game.getGameState();
    }

    public void display(Game game){
        game.displayBoard();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public void undo(Game game){

    }

    public Player getWinner(Game game){
        return null;
    }
}
