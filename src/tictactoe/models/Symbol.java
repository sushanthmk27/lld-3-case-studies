package tictactoe.models;

public class Symbol {

    private char symbolShapeChar;

    public Symbol(char symbolShapeChar){
        this.symbolShapeChar = symbolShapeChar;
    }

    public char getSymbolShapeChar() {
        return symbolShapeChar;
    }

    public void setSymbolShapeChar(char symbolShapeChar) {
        this.symbolShapeChar = symbolShapeChar;
    }
}
