package chess.Pieces;

import Boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

    public Pawn(Color color, Board board) {
        super(color, board);
    }

    @Override
    public String toString(){
        return "P";
    }
}
