package chess;

import Boardgame.Board;
import Boardgame.Piece;

public class ChessPiece extends Piece {

    Color color;
    int moveCount;

    public ChessPiece(Color color, Board board) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
