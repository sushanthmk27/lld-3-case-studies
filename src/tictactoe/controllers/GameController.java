package tictactoe.controllers;

import tictactoe.models.Game;
import tictactoe.models.Player;
import tictactoe.models.enums.GameState;
import tictactoe.strategy.WinnerStrategy;

import java.util.List;

public class GameController {

    public Game startGame(int size, List<Player> playerList, List<WinnerStrategy> winnerStrategyList){
        return new Game(size, playerList, winnerStrategyList);
    }

    public GameState gameState(Game game){
        return null;
    }

    public void display(Game game){

    }

    public void makeMove(Game game){

    }

    public void undo(Game game){

    }

    public Player getWinner(Game game){
        return null;
    }
}
