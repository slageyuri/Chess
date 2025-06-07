package chess.Pieces;

import Boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {


    public Bishop(Board board, Color color) {
        super(color, board);
    }

    @Override
    public String toString(){
        return "B";
    }
}
