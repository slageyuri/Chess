package chess.Pieces;

import Boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(color, board) ;
    }

    @Override
    public String toString(){
        return "R";
    }
}
