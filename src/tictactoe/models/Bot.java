package tictactoe.models;

import tictactoe.models.enums.BotDifficultyLevel;
import tictactoe.models.enums.PlayerType;

public class Bot extends Player{

    private BotDifficultyLevel botDifficultyLevel;

    public Bot(int id, String name, BotDifficultyLevel botDifficultyLevel, Symbol symbol){
        super(id, name, PlayerType.BOT, symbol);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
