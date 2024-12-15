package tictactoe.strategy;

public class RowWinStrategy implements WinnerStrategy{

    @Override
    public void checkWinner() {
        System.out.println("Checking the winner in the row");
    }
}
