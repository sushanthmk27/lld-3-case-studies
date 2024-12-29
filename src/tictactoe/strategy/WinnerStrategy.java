package tictactoe.strategy;

import tictactoe.models.Board;
import tictactoe.models.Move;

public interface WinnerStrategy {

    boolean checkWinner(Board board, Move move);
}
