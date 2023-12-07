package chess;

import boardGame.Board;

public class ChessMatth {
    private Board board;

    public ChessMatth() {
        board = new Board(8,8);
    }
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRowns()][board.getColumns()];
        for (int i = 0;i<board.getRowns();i++){
            for (int j = 0;i< board.getColumns();i++){
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }
}
