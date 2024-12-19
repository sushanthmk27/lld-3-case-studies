package tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<List<Cell>> grid;

    private int size;

    public  Board(int size){
        grid = new ArrayList<>();
        for(int i=0; i<size; i++){
            grid.add(new ArrayList<>());
            for(int j=0; j< size; j++){
                grid.get(i).add(new Cell(i, j));         // 2D ArrayList get created here based on the input Board size when the Board object gets created
            }
        }
    }

    public List<List<Cell>> getGrid() {
        return grid;
    }

    public void setGrid(List<List<Cell>> grid) {
        this.grid = grid;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void display(){
        for(List<Cell> row : grid){                   // here grid is a box in the 2d ArrayList, we traverse the row now
            for(Cell cell : row){
                cell.display();
            }
            System.out.println();
        }
    }
}
