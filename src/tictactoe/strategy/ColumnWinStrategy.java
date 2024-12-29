package tictactoe.strategy;

import tictactoe.models.Board;
import tictactoe.models.Move;

public class ColumnWinStrategy implements WinnerStrategy{
    @Override
    public boolean checkWinner(Board board, Move move) {
        System.out.println("Column winning strategy");
        return false;
    }
}
