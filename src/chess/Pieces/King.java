package chess.Pieces;

import Boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

    public King(Color color, Board board) {
        super(color, board);
    }

    @Override
    public String toString(){
        return "K";
    }
}
