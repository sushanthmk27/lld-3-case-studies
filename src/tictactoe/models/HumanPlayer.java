package tictactoe.models;

import tictactoe.models.enums.PlayerType;

import java.util.Scanner;

public class HumanPlayer extends Player {

    private Integer level;

    private Integer coins;

    private Scanner sc;

    public HumanPlayer(int id, String name, Symbol symbol){
        super(id, name, PlayerType.HUMAN, symbol);
        this.level = 1;
        this.coins = 0;
    }

    public Integer getCoins() {
        return coins;
    }

    public void setCoins(Integer coins) {
        this.coins = coins;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public Move makeMove(Board board) {
        // Here we can add validation to prevent the user from giving the wrong input values
        System.out.println("Enter the row where you want to make the move");
        int row = sc.nextInt();
        System.out.println("Enter the column where you want to make the move");
        int col = sc.nextInt();

        return new Move(new Cell(row,col), this);
    }
}
