package chess.Pieces;

import Boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {

    public Knight(Board board, Color color) {
        super(color, board);
    }

    @Override
    public String toString(){
        return "C";
    }
}
