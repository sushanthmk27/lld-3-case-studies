package tictactoe.strategy;

public class ColumnWinStrategy implements WinnerStrategy{
    @Override
    public void checkWinner() {
        System.out.println("Column winning strategy");
    }
}
