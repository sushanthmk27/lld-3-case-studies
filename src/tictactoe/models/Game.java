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

    private Game(Integer size, List<Player> playerList, List<WinnerStrategy> winnerStrategyList){
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

    public static class GameBuilder{                                         // Added as part of the builder design
        // In the GameBuilder class we only include those attributes which are taken as an input from the user
        private int size;

        private List<Player> playersList;

        private List<WinnerStrategy> winnerStrategy;

        public GameBuilder setSize(int size) {
            this.size = size;
            return this;
        }

        public GameBuilder setPlayersList(List<Player> playersList) {
            this.playersList = playersList;
            return this;
        }

        public GameBuilder setWinnerStrategy(List<WinnerStrategy> winnerStrategy) {
            this.winnerStrategy = winnerStrategy;
            return this;
        }

        public void validate(){
            //Bot count =1
            // No. of players = size-1
            // All players should have different symbols

        }

        public Game build(){                                        // Added as part of the builder design
            return new Game(size, playersList, winnerStrategy);
        }
    }

    public static GameBuilder getBuilderInstance(){                          // Added as part of the builder design
        return new GameBuilder();
    }
}
