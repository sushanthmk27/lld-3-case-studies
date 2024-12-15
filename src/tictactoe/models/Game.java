package tictactoe.models;

import tictactoe.models.enums.GameState;

import java.util.List;

public class Game {

    private Board board;

    private List<Player> playerList;

    private Integer nextPlayerIndex;

    private GameState gameState;

    private List<Move> moveList;
}
