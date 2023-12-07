package aplication;

import chess.ChessMatth;

public class Program {
    public static void main(String[] args) {
        ChessMatth chessMatth = new ChessMatth();
        UI.printBoard(chessMatth.getPieces());
    }
}
