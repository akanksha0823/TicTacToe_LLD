package model;

public class Board {
    String[][] board;

    public Board(int N){
        board = new String[N][N];
        for (int i=0;i<board.length;i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = "_";
            }
        }
    }


    public void setposition(int x, int y,String symbol){
        board[x][y] = symbol;
    }
    public String getposition(int x, int y){
        return board[x][y];
    }

    public String[][] getBoard() {
        return board;
    }
}
