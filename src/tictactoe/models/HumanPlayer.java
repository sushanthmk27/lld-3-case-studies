package tictactoe.models;

import tictactoe.models.enums.PlayerType;

public class HumanPlayer extends Player {

    private Integer level;

    private Integer coins;

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
}
