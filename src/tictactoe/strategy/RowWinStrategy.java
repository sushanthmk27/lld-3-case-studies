package tictactoe.strategy;

import tictactoe.models.Board;
import tictactoe.models.Move;

public class RowWinStrategy implements WinnerStrategy{

    @Override
    public boolean checkWinner(Board board, Move move) {
        System.out.println("Checking the winner in the row");
        return false;           // added for temp purpose
    }
}
