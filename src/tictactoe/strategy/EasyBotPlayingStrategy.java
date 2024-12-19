package tictactoe.strategy;

import tictactoe.models.Board;
import tictactoe.models.Cell;
import tictactoe.models.Move;
import tictactoe.models.enums.CellState;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board) {
        for(List<Cell> row : board.getGrid()){
            for(Cell cell : row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    // when the cell is empty, bot makes the move
                    return new Move(new Cell(cell.getRow(), cell.getCol()), null);
                }
            }
        }
        return null;
    }
}
