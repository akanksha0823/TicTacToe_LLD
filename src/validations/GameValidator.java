package validations;

import model.Board;

public class GameValidator {
    Board board;
    public GameValidator(Board board){
        this.board = board;
    }

    public boolean validateCoordinates(int x, int y){
        return x < board.getBoard().length && y<board.getBoard().length && x>=0 && y>=0;
    }

    public boolean validateIsBoardPositionEmpty(int x, int y){
        return board.getposition(x,y).equals("_");
    }
}
