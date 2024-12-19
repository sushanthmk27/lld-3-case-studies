package tictactoe.strategy;

import tictactoe.models.Board;
import tictactoe.models.Move;

public class MediumBotPlayingStrategy  implements BotPlayingStrategy{

    @Override
    public Move makeMove(Board board) {
        // Here the bot need to select the random empty boxes rather than traversing in a sequential manner
        return null;
    }
}
