package mode;

import model.Board;

public class ConsolePrint implements  Print{
    @Override
    public void printBoard(Board board) {
            for (int i=0;i<board.getBoard().length;i++) {
                for (int j = 0; j < board.getBoard().length; j++) {
                    System.out.print(board.getBoard()[i][j] + " ");
                }
                System.out.println();
            }
        }
}

