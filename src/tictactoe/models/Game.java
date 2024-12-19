package tictactoe.models;

import tictactoe.models.enums.GameState;
import tictactoe.strategy.WinnerStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Board board;

    private List<Player> playerList;

    private Integer nextPlayerIndex;

    private GameState gameState;

    private List<Move> moveList;

    private List<WinnerStrategy> winningStrategyList;

    private Player winner;

    public Game(Integer size, List<Player> playerList, List<WinnerStrategy> winnerStrategyList){
        board = new Board(size);
        this.playerList = playerList;
        this.winningStrategyList = winnerStrategyList;
        this.nextPlayerIndex = 0;
        this.gameState = GameState.IN_PROGRESS;
        this.winner = null;
        this.moveList = new ArrayList<>();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public Integer getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(Integer nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<Move> getMoveList() {
        return moveList;
    }

    public void setMoveList(List<Move> moveList) {
        this.moveList = moveList;
    }

    public List<WinnerStrategy> getWinningStrategyList() {
        return winningStrategyList;
    }

    public void setWinningStrategyList(List<WinnerStrategy> winningStrategyList) {
        this.winningStrategyList = winningStrategyList;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public void displayBoard() {
        board.display();
    }
}
