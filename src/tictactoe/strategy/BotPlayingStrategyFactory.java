package tictactoe.strategy;

import tictactoe.models.enums.BotDifficultyLevel;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel){
        if(botDifficultyLevel == BotDifficultyLevel.EASY){
            return new EasyBotPlayingStrategy();
        }
        // here accordingly we can write the conditions for Medium and Hard bot playing strategies
        return null;
    }
}
